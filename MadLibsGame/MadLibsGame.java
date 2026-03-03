package MadLibsGame;

import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args){
        // Mad libs Game

        Scanner scanner = new Scanner(System.in);
        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.print("Enter an adjective (description): ");
        adj1 = scanner.nextLine();

        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adj2 = scanner.nextLine();

        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adj3 = scanner.nextLine();

        System.out.println("Today I went to a " + adj1 + " zoo.");
        System.out.println("In exhibit I saw " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");


        scanner.close();
    }
    
}
