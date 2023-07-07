package org.example;

import javax.naming.InvalidNameException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws InvalidNumberException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        try{
            int num = scanner.nextInt();
            if (num < 0 || num == 0){
                throw new InvalidNumberException("Некорректное число");
            } else {
                System.out.println("Число корректно");
            }
        }
        catch (InputMismatchException e){
            throw new InputMismatchException("Некорректный ввод");
        }
        scanner.close();
    }
}
class InvalidNumberException extends Exception{
    public InvalidNumberException(String message){
        super(message);
    }
}
