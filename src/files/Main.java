package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        readJavaFiles(Paths.get("src"));
    }

    public static void createDirectory(Path path) {
        try {
            if (!Files.exists(path)) {
                Files.createDirectories(path);
                System.out.println("Diretório criado: " + path.toAbsolutePath());
            } else {
                System.out.println("Diretório já existe: " + path.toAbsolutePath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readContent(Path path) {
        try {
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readJavaFiles(Path path) {
        try {
            Files.list(path)
                    .forEach(file -> {
                        if (Files.isDirectory(file)) {
                            System.out.println("Diretório: " + file.toAbsolutePath());
                            readJavaFiles(file);
                        } else if (file.toString().endsWith(".java")) {
                            System.out.println("Arquivo: " + file.toAbsolutePath());
                            readContent(file);
                        }
                    });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void readDirectory(Path path) {
        try {
            Files.list(path)
                    .forEach(file -> {
                        if (Files.isDirectory(file)) {
                            System.out.println("Diretório: " + file.toAbsolutePath());
                            readDirectory(file);
                        } else {
                            System.out.println("Arquivo: " + file.toAbsolutePath());
                        }
                    });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
