import java.util.Scanner;

public class Workday {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número de horas trabalhadas no mês: ");
		int horasTrabalhadas = input.nextInt();

		System.out.print("Digite o valor do salário por hora: R$");
		double salarioHora = input.nextDouble();

		double salarioBase = 40 * salarioHora * 4;

		if (horasTrabalhadas > 40 * 4) {
			double horasExtras = horasTrabalhadas - (40 * 4);
			double valorHoraExtra = salarioHora * 1.5;
			double salarioHoraExtra = horasExtras * valorHoraExtra;

			double salarioTotal = salarioBase + salarioHoraExtra;
			System.out.printf("O salário total do funcionário é: R$%.2f\n", salarioTotal);
		} else {
			System.out.printf("O salário total do funcionário é: R$%.2f\n", salarioBase);
		}
		input.close();
	}
}
