import java.util.*;
// import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;89
        
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Game!");
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between " + minRange + " and " + maxRange + ".");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    guessedCorrectly = true;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again!");
                } else {
                    System.out.println("Too high. Try again!");
                }
            }

            if (guessedCorrectly) {
                System.out.println("Congratulations! You guessed the correct number " + targetNumber + " in " + attempts + " attempts.");
                score++;
            } else {
                System.out.println("Out of attempts. The number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgainChoice = scanner.next();

            if (!playAgainChoice.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }

        System.out.println("Your final score: " + score);
        System.out.println("Thank you for playing! Goodbye!");
    }
}
