package com.animals;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean again = true;
        //making a simple do-while loop, for our main code
            do {
                System.out.print("Please enter your pet's name: ");
                String name = scan.nextLine();
                //making a simple switch-case function, to determine an output text, based on input
                switch (name) {
                    case "Rudy":
                        Animal cat = new Animal("Rudy", "Meow", "cat", 3);
                        System.out.println(cat.getValues());
                        break;
                    case "Rex":
                        Animal dog = new Animal("Rex", "Woof", "dog", 5);
                        System.out.println(dog.getValues());
                        break;
                    case "Mini":
                        Animal hamster = new Animal("Mini", "Pi", "hamster", 1);
                        System.out.println(hamster.getValues());
                        break;
                    default:
                        System.out.println("There is not pet with name like this, try again.");
                }
                //making a simple playAgain function, to be able to execute code again, or terminate it;
                System.out.println("Would you like to see information about another pet? (Y/N): ");
                String playAgainInput = scan.next().trim().toUpperCase();
                //making a simple input validation for our playAgain function
                while (!playAgainInput.equals("Y") && !playAgainInput.equals("N")) {
                    System.out.print("Invalid input. Please enter 'Y' or 'N': ");
                    playAgainInput = scan.next().trim().toUpperCase();
                }  scan.nextLine();
                //making an ending function, which will switch off the again bool, to terminate a code
                if (playAgainInput.equals("N")) {
                    again = false;
                    System.out.println("See you later. Goodbye!");
                }
            } while (again);
            scan.close();
    }
}