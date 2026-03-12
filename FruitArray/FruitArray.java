package FruitArray;

import java.util.Arrays;
import java.util.Scanner;

public class FruitArray {
    public static void main(String[] args) {
        // Array of fruits

        // Import the libraries
        Scanner scanner = new Scanner(System.in);
        
        // Declare an array of fruits and the size 
        String[] fruits;
        int size;

        // Declare the user input
        System.out.print("How many fruits do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        fruits = new String[size];
        // Loop through the fruits
        for(int i = 0; i < fruits.length; i ++){
            System.out.print("Enter fruit: ");
            fruits[i] = scanner.nextLine();
        }
        // Print the arrays using enhanced loop
        System.out.println("The fruits in an array are: ");
        for(String fruit : fruits){
            // Sort fruits
            Arrays.sort(fruits);
            System.out.println(fruit);
        }
        // Close the scanner
        scanner.close();
    }
}
