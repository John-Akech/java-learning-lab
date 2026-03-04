package CompoundInterestCalculator;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        // Compound Interest Calculator
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded = 0;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interes rate (in %): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        rate = rate / 100;

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}