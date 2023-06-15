import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        boolean playAgain = true;
        System.out.println("It's a Simple Guess the number game, just guess a number from 1 to 10!");
        while (playAgain) {
            int i = 0;
            int los = rnd.nextInt(10) + 1;
            while (true) {
                try {
                    i++;
                    System.out.print("Type your number: ");
                    int odp = scan.nextInt();
                    if (odp < los) {
                        System.out.print("The number is higher, try again: ");
                    } else if (odp > los) {
                        System.out.print("The number is lower, try again: ");
                    } else {
                        System.out.println("Congratulations, the number " + odp + " was correct! You've guessed after " + i + " try.");
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scan.nextLine();
                }
            }
            System.out.print("Do you want to play again? (Y/N): ");
            String playAgainInput = scan.next().trim().toUpperCase();
            while (!playAgainInput.equals("Y") && !playAgainInput.equals("N")) {
                System.out.print("Invalid input. Please enter 'Y' or 'N': ");
                playAgainInput = scan.next().trim().toUpperCase();
            }
            if (playAgainInput.equals("N")) {
                playAgain = false;
                System.out.println("Thank you for playing. Goodbye!");
            }
        }
    }
}
