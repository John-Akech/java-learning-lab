package CalculateHypoteneus;

import java.util.Scanner;

public class CalculateHypoteneus {
        public static void main(String[] args){

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of size A?: ");
        a = scanner.nextDouble();

        System.out.print("What is the length of size B?: ");
        b = scanner.nextDouble();

        System.out.print("What is the length of size C?: ");
        c = Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.println("The length of C is: " + c + "cm");
        scanner.close();
    }
    
}
