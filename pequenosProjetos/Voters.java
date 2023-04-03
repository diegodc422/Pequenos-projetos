import java.util.Scanner;

public class Voters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número total de eleitores: ");
		int totalEleitores = sc.nextInt();

		System.out.print("Digite o número de votos em branco: ");
		int votosBrancos = sc.nextInt();

		System.out.print("Digite o número de votos nulos: ");
		int votosNulos = sc.nextInt();

		System.out.print("Digite o número de votos válidos: ");
		int votosValidos = sc.nextInt();

		double percVotosBrancos = (double) votosBrancos / totalEleitores * 100;
		double percVotosNulos = (double) votosNulos / totalEleitores * 100;
		double percVotosValidos = (double) votosValidos / totalEleitores * 100;

		System.out.printf("Percentual de votos em branco: %.2f%%\n", percVotosBrancos);
		System.out.printf("Percentual de votos nulos: %.2f%%\n", percVotosNulos);
		System.out.printf("Percentual de votos válidos: %.2f%%\n", percVotosValidos);

		sc.close();
	}
}
