package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws NumberOutOfRangeException, NumberSumException,DivisionByZeroException{
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            System.out.println("Введите третье число: ");
            int num3 = scanner.nextInt();
            if (num1 > 100){
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            } else if (num2 < 0){
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            } else if (num1 + num2 < 10){
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            } else if (num3 == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            } else {
                System.out.println("Проверка пройдена успешно");
            }
        }
        catch (InputMismatchException e){
            throw new InputMismatchException("Некорректный ввод");
        }
        scanner.close();
    }
}
class NumberOutOfRangeException extends Exception{
    public NumberOutOfRangeException(String message){
        super(message);
    }
}
class NumberSumException extends Exception{
    public NumberSumException(String messagge){
        super(messagge);
    }
}
class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}
