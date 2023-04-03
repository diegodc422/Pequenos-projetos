import java.util.Scanner;

public class NumberInFull {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número de 1 a 100: ");
		int num = input.nextInt();

		if (num < 1 || num > 100) {
			System.out.println("Número inválido");
			System.exit(0);
		}

		String[] unidades = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
				"onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };
		String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta",
				"noventa" };
		String[] centenas = { "", "cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos",
				"setecentos", "oitocentos", "novecentos" };

		if (num == 100) {
			System.out.println("cem");
		} else {
			int unidade = num % 10;
			int dezena = (num / 10) % 10;
			int centena = (num / 100) % 10;

			if (centena > 0) {
				System.out.print(centenas[centena]);
				if (dezena == 0 && unidade == 0) {
					System.out.println();
				} else {
					System.out.print(" e ");
				}
			}

			if (dezena > 1) {
				System.out.print(dezenas[dezena]);
				if (unidade > 0) {
					System.out.print(" e " + unidades[unidade]);
				}
			} else if (dezena == 1) {
				System.out.print(unidades[num % 100]);
			} else {
				System.out.print(unidades[unidade]);
			}

			System.out.println();
		}

		input.close();
	}
}
