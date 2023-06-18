package com.simple_calculator;

import java.util.Scanner;

public class Logic {
    private static final Scanner scan = new Scanner(System.in);
    private static double num1, num2, res;
    private static char op;

    public static void performCalculation() {
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
        double num = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter your number: ");
            if (scan.hasNextDouble()) {
                num = scan.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid numeric input.");
                scan.nextLine();
            }
        }
        return num;
    }

    private static char inputOperator() {
        char input = '0';
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter your operator (+, -, *, /): ");
            input = scan.next().charAt(0);
            if (input != '+' && input != '-' && input != '*' && input != '/') {
                System.out.println("Invalid input! Please enter a valid operator.");
                scan.nextLine();
            } else {
                validInput = true;
            }
        }
        return input;
    }

    private static double performOperation() {
        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
        }
        return res;
    }
}
