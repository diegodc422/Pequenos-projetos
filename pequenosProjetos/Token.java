package pequenosProjetos;

import java.util.Scanner;

public class Token {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase e aperte enter.");
        String sentence = input.nextLine();

        String[] tokens = sentence.split(" ");
        System.out.printf("Número de palavras: %d%nAs palavras são:%n", tokens.length);

        for (String token : tokens) {
            System.out.println(token);

            input.close();
        }
    }
}
