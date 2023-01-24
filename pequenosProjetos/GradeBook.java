package pequenosProjetos;

public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void processGrade() {

        outputGrades();
        System.out.printf("%nMédia da turma é %.2f%n", getAverage());

        System.out.printf("Menor nota é %d%nMaior nota é: %d%n%n", getMinimum(), getMaximum());

        outputBarChart();
    }

    private void outputGrades() {

        System.out.printf("As notas são: %n%n");

        for (int student = 0; student < grades.length; student++)
            System.out.printf("Estudante %2d: %3d%n", student + 1, grades[student]);
    }

    private double getAverage() {

        int total = 0;
        for (int grade : grades)
            total += grade;
        return (double) total / grades.length;
    }

    private int getMinimum() {
        int lowGrade = grades[0];
        for (int grade : grades) {
            if (grade < lowGrade)
                lowGrade = grade;
        }
        return lowGrade;
    }

    private int getMaximum() {
        int highGrade = grades[0];
        for (int grade : grades) {
            if (grade > highGrade)
                highGrade = grade;
        }
        return highGrade;
    }

    private void outputBarChart() {

        System.out.println("Notas de distribuição");
        int[] frequency = new int[11];

        for (int grade : grades)
            ++frequency[grade / 10];

        for (int count = 0; count < frequency.length; count++) {
            if (count == 0)
                System.out.printf("%5d:	", 100);
            else
                System.out.printf("%02d-%02d:	", count * 10, count * 10 + 9);

            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 39, 76, 88, 27, 91, 43, 67, 55, 29, 82, 9, 29,
                53, 72, 46, 28, 49, 39, 59, 60 };

        GradeBook myGradeBook = new GradeBook("Estudo Java", gradesArray);
        System.out.printf("Bem vindo ao livro de notas %n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrade();
    }
}