package ShoppingCardProgram;

import java.util.Scanner;

public class ShoppingCard {
        public static void main(String[] args){
        // Shopping card program

        // Declare variables

        String item;
        double price;
        int qty;
        double total = 0;
        char currency;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("What currency are you using?: ");
        currency = scanner.next().charAt(0);

        System.out.print("How many would you like?: ");
        qty = scanner.nextInt();

        total = qty * price;

        System.out.println("You have bought " + qty + " " + item + "(s).");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}
