import java.util.Scanner;

public class CommissionCar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número de carros vendidos: ");
		int numCarros = input.nextInt();

		System.out.print("Digite o valor total de vendas: R$");
		double valorVendas = input.nextDouble();

		System.out.print("Digite o salário fixo do vendedor: R$");
		double salarioFixo = input.nextDouble();

		System.out.print("Digite o valor que o vendedor recebe por carro vendido: R$");
		double valorPorCarro = input.nextDouble();

		double comissaoFixa = numCarros * valorPorCarro;
		double comissaoVariavel = 0.05 * valorVendas;
		double salarioFinal = salarioFixo + comissaoFixa + comissaoVariavel;

		System.out.printf("O salário final do vendedor é: R$%.2f", salarioFinal);
		input.close();
	}
}
