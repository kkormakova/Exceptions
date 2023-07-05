package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        String input = scanner.nextLine();
        try{
            int age = Integer.parseInt(input);
            System.out.printf("Ваш возраст = %d", age);
        }
        catch (NumberFormatException e){
            throw new NumberFormatException("Некорректный ввод");
        }
    }
}
