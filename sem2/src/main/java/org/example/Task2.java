package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws DivisionByZeroException{
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ввeдите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            if (num2 == 0){
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            } else {
                System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
            }
        }
        catch (InputMismatchException e){
            throw new InputMismatchException("Некорректный ввод");
        }
        scanner.close();
    }
}
class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}