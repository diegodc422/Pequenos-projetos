import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Password {

	public static void main(String[] args) {
		String caracteresEspeciais = "!@#$%^&*()-+";
		String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
		String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String digitos = "0123456789";

		Set<Character> conjuntoCaracteres = new HashSet<>();

		for (char c : caracteresEspeciais.toCharArray()) {
			conjuntoCaracteres.add(c);
		}

		for (char c : letrasMinusculas.toCharArray()) {
			conjuntoCaracteres.add(c);
		}

		for (char c : letrasMaiusculas.toCharArray()) {
			conjuntoCaracteres.add(c);
		}

		for (char c : digitos.toCharArray()) {
			conjuntoCaracteres.add(c);
		}

		Character[] arrayCaracteres = conjuntoCaracteres.toArray(new Character[conjuntoCaracteres.size()]);

		String senha = "";

		Random random = new Random();

		senha += caracteresEspeciais.charAt(random.nextInt(caracteresEspeciais.length()));

		senha += letrasMaiusculas.charAt(random.nextInt(letrasMaiusculas.length()));

		senha += letrasMinusculas.charAt(random.nextInt(letrasMinusculas.length()));

		senha += digitos.charAt(random.nextInt(digitos.length()));

		while (senha.length() < 6) {
			senha += arrayCaracteres[random.nextInt(arrayCaracteres.length)];
		}

		System.out.println("Senha gerada: " + senha);
	}
}
