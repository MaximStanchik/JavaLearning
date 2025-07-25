package org.Stanchik.Lombok;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SneakyThrowsExample {
    @SneakyThrows
    public void readFile(String filePath) {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        System.out.println(line);
        reader.close();
    }
    public void readFileWithoutSneakyThrows(String filePath) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            // Обработка исключения
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        SneakyThrowsExample example = new SneakyThrowsExample();
        example.readFile("nonexistent.txt");
    }
}
