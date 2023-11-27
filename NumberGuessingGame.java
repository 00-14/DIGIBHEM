import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String replay;

        do {
            int numberToGuess = (int) (Math.random() * 100) + 1;
            int attempts = 6;
            int guess;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100");
            System.out.println("You have " + attempts + " attempts to guess the number");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                sc.nextLine(); // Consume newline character

                if (guess == numberToGuess) {
                    System.out.println("Congratulations!! You guessed the correct number");
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!!   Try again");
                } else {
                    System.out.println("Too high!!   Try again");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("Sorry, you ran out of attempts. The number was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            replay = sc.nextLine();
        } while (replay.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing the Number Guessing Game!!");
    }
}
