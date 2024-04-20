package org.example;

import java.util.Base64;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String runType = args[0];
            if ("1".equals(runType)) {
                System.out.println(encodeToBase64(args[1]));
            } else if ("2".equals(runType)) {
                System.out.println(generateUniqueName());
            }else if ("3".equals(runType)) {
                System.out.println("Main Gradle Starter Executado com sucesso!");
            }
        } else {
            System.out.println("Executado sem parametros!");
        }
    }
    public static String generateUniqueName() {
        // Obter o timestamp atual
        long timestamp = System.currentTimeMillis();

        // Gerar um UUID aleatório
        String uuid = UUID.randomUUID().toString();

        // Concatenar o timestamp com o UUID
        String uniqueName = timestamp + "_" + uuid;

        return uniqueName;
    }
    public static String encodeToBase64(String input) {
        // Codificando a string de entrada em base64
        String encodedString = Base64.getEncoder().encodeToString(input.getBytes());
        return encodedString;
    }
}