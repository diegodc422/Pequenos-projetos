import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma string: ");
		String str = input.nextLine();

		int n = str.length();
		char[] chars = str.toCharArray();

		System.out.println("Número de possíveis combinações: " + factorial(n));

		permute(chars, 0, n - 1);
		input.close();
	}

	public static void permute(char[] chars, int l, int r) {
		if (l == r) {
			System.out.println(String.valueOf(chars));
		} else {
			for (int i = l; i <= r; i++) {
				swap(chars, l, i);
				permute(chars, l + 1, r);
				swap(chars, l, i);
			}
		}
	}

	public static void swap(char[] chars, int i, int j) {
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
