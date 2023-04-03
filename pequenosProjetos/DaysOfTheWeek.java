import java.util.Scanner;

public class DaysOfTheWeek {

	public static void main(String[] args) {
		daysWeek();
	}

	public static void daysWeek() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número entre 1 até 7 e veja o dia da semana.");
		int number = input.nextInt();
		if (number == 1)
			System.out.println("Domingo");
		else if (number == 2)
			System.out.println("Segunda-feira");
		else if (number == 3)
			System.out.println("Terça-feira");
		else if (number == 4)
			System.out.println("Quarta-feira");
		else if (number == 5)
			System.out.println("Quinta-feira");
		else if (number == 6)
			System.out.println("Sexta-feira");
		else if (number == 7)
			System.out.println("Sábado");
		else
			System.out.println("Número inválido");
		input.close();
	}
}
