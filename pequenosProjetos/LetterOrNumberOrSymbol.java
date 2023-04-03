import java.util.Scanner;

public class LetterOrNumberOrSymbol {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um caractere:");
		char caractere = input.next().charAt(0);

		if (Character.isLetter(caractere)) {
			if ("AEIOUaeiou".indexOf(caractere) != -1) {
				System.out.println("O caractere digitado é uma vogal.");
			} else {
				System.out.println("O caractere digitado é uma consoante.");
			}
		} else if (Character.isDigit(caractere)) {
			System.out.println("O caractere digitado é um número.");
		} else {
			System.out.println("O caractere digitado é um símbolo.");
		}

		input.close();
	}
}
