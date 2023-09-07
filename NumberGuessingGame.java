import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int maxAttempts = 10;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Can you guess it?");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
                continue;
            }
            
            attempts++;
            
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
            
            int remainingAttempts = maxAttempts - attempts;
            if (remainingAttempts > 0) {
                System.out.println("You have " + remainingAttempts + " attempts remaining.");
            } else {
                System.out.println("Sorry, you've run out of attempts. The number was " + numberToGuess + ".");
            }
        }
        
        scanner.close();
    }
}

