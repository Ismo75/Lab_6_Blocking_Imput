import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain;

        do {
            int guess;
            int number = rand.nextInt(10) + 1; // Random between 1 and 10

            // Input loop to get a valid guess
            while (true) {
                System.out.print("Guess a number between 1 and 10: ");
                String input = scanner.nextLine();
                try {
                    guess = Integer.parseInt(input);
                    if (guess < 1 || guess > 10) throw new Exception();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid guess. Enter a number between 1 and 10.");
                }
            }

            System.out.println("Random number was: " + number);
            if (guess == number) {
                System.out.println("On the money!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            // Ask to play again
            System.out.print("Play again? [Y/N]: ");
            String choice = scanner.nextLine().trim();
            playAgain = choice.equalsIgnoreCase("Y");

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
