package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Введите число: ");
            double base = scanner.nextDouble();
            System.out.println("Введите степень: ");
            double exponent = scanner.nextDouble();
            double result = calculatePower(base,exponent);
            System.out.println("Число " + base + " в степени " + exponent + " = " + result);
        }
        catch (InputMismatchException e){
            System.out.println("Ошибка ввода числа");
        } catch (InvalidInputException e) {
            handleInvalidInputException(e);
        }
    }
    public static double handleInvalidInputException(InvalidInputException e){
        System.out.println("Ошибка: " + e.getMessage());
        return 0;
    }
    public static double calculatePower(double base, double exponent) throws InvalidInputException{
        if (base == 0 || exponent < 0){
            throw new InvalidInputException("Ошибка ввода");
        }
        return Math.pow(base, exponent);
    }
}
class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    }
}
