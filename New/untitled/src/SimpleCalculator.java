import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2, res;
        char op;

        while (true) {
            System.out.print("This is a simple calculator app, please type your first number: ");
            num1 = scan.nextDouble();
            System.out.print("Please type an operator(+, -, *, /): ");
            op = scan.next().charAt(0);
            System.out.print("Please type second number: ");
            num2 = scan.nextDouble();
            if (op == '/' && num2 == 0) {
                System.out.println("You can't divide by zero, please enter a non-zero value for the second number.");
                continue;
            }
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
                default:
                    System.out.println("Invalid operator, please enter a correct one." );
                    continue;
            }
            System.out.println("Result: " + res);
            break;
        }
        scan.close();
    }
}