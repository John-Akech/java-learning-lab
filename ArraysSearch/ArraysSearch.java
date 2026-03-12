package ArraysSearch;

import java.util.Scanner;

public class ArraysSearch {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arrays search

        // Create an array of numbers
        int[] numbers = {1,3,5,2,7,4,9,6,8};

        // Declare variables
        int target;
        boolean isFound = false;

        System.out.println("ARRAYS SEARCH PROGRAM!");
        System.out.print("Enter the traget to search: ");
        target = scanner.nextInt();

        // Loop through the array of numbrs
        for(int i = 0; i < numbers.length; i ++){
            if(target == numbers[i]){
                System.out.printf("Element %d found at index: %d%n ",target, i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.printf("Element %d not found in the array. ", target);
        }
        scanner.close();
    }
}
