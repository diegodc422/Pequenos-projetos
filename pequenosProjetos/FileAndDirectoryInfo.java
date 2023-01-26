package pequenosProjetos;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o arquivo/diretório");

        Path path = Paths.get(input.nextLine());
        if (Files.exists(path)) {

            System.out.printf("%n%s existe%n", path.getFileName());
            System.out.printf("%s o diretório/caminho", Files.isDirectory(path) ? "Is" : "Is not");
            System.out.printf("%s o caminho%n", path.isAbsolute() ? "Is" : "Is not");
            System.out.printf("Ultima modificação: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Tamanho: %s%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolut path: %s%n", path.toAbsolutePath());

            if (Files.isDirectory(path)) {
                System.out.printf("%nDiretório contém:%n");
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                for (Path path2 : directoryStream)
                    System.out.println(path2);
            }
        } else {
            System.out.printf("%s não existe", path);
        }
        input.close();
    }
}
