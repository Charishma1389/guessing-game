import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        guessingGame();
    }

    public static void guessingGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");

            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " in " + attempts + " attempts.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }


        scanner.close();
    }
}
