import java.util.Scanner;

public class AnalyticalGeometry {

	public static void main(String[] args) {

		System.out.println("A distância entre os 2 pontos são: " + calcularDistanciaEntreDoisPontos());
	}

	public static double calcularDistanciaEntreDoisPontos() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor de xA: ");
		double xA = input.nextDouble();
		System.out.println("Digite o valor de yA: ");
		double yA = input.nextDouble();

		System.out.println("Digite o valor de xB: ");
		double xB = input.nextDouble();
		System.out.println("Digite o valor de yB: ");
		double yB = input.nextDouble();

		double distanceX = xB - xA;
		double distanceY = yB - yA;
		double distanceX2 = Math.pow(distanceX, 2);
		double distanceY2 = Math.pow(distanceY, 2);
		double distanceXY = distanceY2 + distanceX2;
		double distanceTotal = Math.sqrt(distanceXY);

		input.close();
		return distanceTotal;
	}

}
