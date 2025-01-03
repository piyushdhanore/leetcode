package Strings_Basics;

import java.util.Scanner;

public class EnteredDigitIsSingle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char input;

        while (true) {
            System.out.print("Enter a single digit (0-9): ");
            String userInput = scanner.nextLine();

            // Check if the input length is 1 and it's a digit
            if (userInput.length() == 1 && Character.isDigit(userInput.charAt(0))) {
                input = userInput.charAt(0);
                break;
            } else {
                System.out.println("Invalid input! Please enter a single digit.");
            }
        }

        System.out.println("You entered: " + input);
        scanner.close();
    }
}
