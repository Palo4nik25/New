package com.simple_calculator;

import java.util.Scanner;

public class Logic {
    static Scanner scan = new Scanner(System.in);
    static double num1, num2, res;
    static char op;

    public static void countLogic() {
        while (true) {
            num1 = inputDouble();
            op = inputOperator();
            num2 = inputDouble();

            if (op == '/' && num2 == 0) {
                System.out.println("You can't divide by zero, please enter a non-zero value for the second number.");
                continue;
            }
            System.out.println("Result: " + performOperation());
            break;
        }
        scan.close();
    }

    private static double inputDouble() {
        System.out.print("Please enter your number: ");
        return scan.nextDouble();
    }

    private static char inputOperator() {
        System.out.print("Please enter your operator(+, -, *, /): ");
        return scan.next().charAt(0);
    }

    private static double performOperation() {
        switch (op) {
            case '+':
                sum();
                break;
            case '-':
                diff();
                break;
            case '*':
                multiply();
                break;
            case '/':
                divide();
                break;
            default:
                System.out.println("Invalid operator, please enter a correct one.");
                break;
        }
        return res;
    }

    public static void sum(){
        res = num1 + num2;
    }

    public static void diff(){
        res = num1 - num2;
    }

    public static void multiply(){
        res = num1 * num2;
    }

    public static void divide(){
        res = num1 / num2;
    }
}
