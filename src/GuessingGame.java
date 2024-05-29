import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(101);

        Scanner userInput = new Scanner(System.in);

        int tries = 1;
        boolean hasGuessedCorrectly = false;

        while (tries <= 5) {
            System.out.println("Guess a number between 0-100!");
            int userGuess = userInput.nextInt();


            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the secret number in " + tries + " tries!");
                hasGuessedCorrectly = true;
                break;
            } else {
                System.out.println("Try again!");
                if (userGuess > randomNumber) {
                    System.out.println("Your number was higher than the mystery number!");
                } else {
                    System.out.println("Your number was lower than the mystery number!");
                }
                tries += 1;
            }
        }
        if (!hasGuessedCorrectly) {
            System.out.println("You've used all your tries. The correct number was " + randomNumber + ".");
        }
        userInput.close();

    }
}
