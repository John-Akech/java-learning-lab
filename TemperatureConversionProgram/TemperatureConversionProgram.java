package TemperatureConversionProgram;

import java.util.Scanner;

public class TemperatureConversionProgram {
        public static void main(String[] args){
        // Temperature converter
        //Declare variables

        double temp;
        double newTemp;
        String unit;

        Scanner scanner = new Scanner(System.in);

        System.out.println("<-- Temperature Conversion Program -->");
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert the temperature to Celsius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("The new temperature is %.1f°%s ", newTemp, unit);
        scanner.close();
    }
}
