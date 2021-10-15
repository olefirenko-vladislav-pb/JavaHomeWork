package com.pb.olefirenko.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.print("Введіть перше ціле число ");
        operand1 = scan.nextInt();
        System.out.print("Введіть друге ціле число ");
        operand2 = scan.nextInt();
        System.out.print("Введіть знак арифметичної операції: +,-,*,/ ");
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println("число 1 + число 2 = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("число 1 - число 2 = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("число 1 * число 2 = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.print("Помилка. На нуль ділити не можна");
                } else {
                    System.out.println("число 1 / число 2 = " + (operand1 / operand2));
                }
                break;
        }
    }
}

