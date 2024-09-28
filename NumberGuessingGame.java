import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;
        
        // Instructions for the player
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Can you guess it?");
        
        // Game loop: keep asking the user for input until they guess correctly
        while (userGuess != randomNumber) {
            // Prompt the user for a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++; // Increment the number of attempts
            
            // Check if the guess is too low, too high, or correct
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}

