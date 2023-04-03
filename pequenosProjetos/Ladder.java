import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {
		ladder();
	}

	public static void ladder() {
		Scanner input = new Scanner(System.in);
		List<String> ladder = new ArrayList<>();
		System.out.println("Digite um número");
		int steps = input.nextInt();

		for (int quantity = 0; quantity < steps; quantity++) {
			ladder.add(" ".repeat(steps - quantity) + "*".repeat(quantity + 1));
		}

		for (String string : ladder)
			System.out.println(string);
		input.close();
	}
}
