package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
        public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // NUMBER GUESSING GAME
         int guess = 0;
         int attempts = 0;
         int randomNumber = random.nextInt(1, 11);

        System.out.println("Number Guessing Game");
        System.out.print("Guess a number between 1 and 10: ");

         do{
             System.out.print("Enter a guess: ");
             guess = scanner.nextInt();
             attempts++;

             if(guess > randomNumber){
                 System.out.println("TOO LOW GUESS! Try again");
             }else if(guess < randomNumber){
                 System.out.println("TOO HIGH GUESS!  Try again");
             }else {
                 System.out.println("GOOD GUESS!");
             }

         }while(guess != randomNumber);

        System.out.println("You picked " + guess);

        scanner.close();
    }   
}
