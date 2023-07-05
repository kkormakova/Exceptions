package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            System.out.printf("%d / %d = %d", num1, num2, division(num1,num2));
        }
        catch (InputMismatchException e){
            System.out.println("Некорректный ввод");
        }
    }
    public static int division(int num1, int num2){
        if (num2 == 0){
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return num1 / num2;
    }
}
