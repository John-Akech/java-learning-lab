package RockPaperScissorsGame;

import java.util.Random;
import java.util.Scanner;

// Import the classes we need
// Scanner -> used to read input from the user
// Random -> used to generate the computer's random choice

public class RockPaperScissorsGame {

    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String[] args) {
        // Import libraries
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare variables

        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        // Create an array to store choices

        String[] choices = {"rock", "paper", "scissors"};

        do{
            // Start the game

            System.out.print("Enter your choice (rock, papaer, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

        // Validate the user choices

            if (!playerChoice.equals("rock")
                && !playerChoice.equals("paper")
                && !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
            continue;
        }

        // Generate computer choices
        computerChoice = choices[random.nextInt(3)];
        // Show the computer's choice
        System.out.println("Computer choice: " + computerChoice);

        if(playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        }
        else if (
            (playerChoice.equals("rock") && computerChoice.equals("scissors"))
            || (playerChoice.equals("paper") && computerChoice.equals("rock"))
            || (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
        System.out.print("Play again?: ");
        playAgain = scanner.nextLine().toLowerCase();

        }
        while(playAgain.equals("yes"));

        System.out.println("Thank you for playing the game.");

        scanner.close();
    }
}