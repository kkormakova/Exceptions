package org.example;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        File correctFile = new File("/Users/k.kormakova/Documents/Exeptions/sem1/correct_file.txt");
        File badFile = new File("/Users/k.kormakova/Documents/Exeptions/sem1/bad_file.txt");
        File missFile = new File("miss_file.txt");
        System.out.println("Корректный файл: ");
        sumInFile(correctFile);
        System.out.println("Файл с некорректным вводом: ");
        sumInFile(badFile);
        System.out.println("Не существуюший файл: ");
        sumInFile(missFile);
    }

    public static void sumInFile(File file) {
        int result = 0;
        try {
            Reader reader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(reader);
            while (buffReader.ready()) {
                result += Integer.parseInt(buffReader.readLine());
            }
            System.out.println(result);
            buffReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при открытии файла");
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        } catch (NumberFormatException e) {
            System.out.println("Некорректное значение числа");
        }
    }
}
