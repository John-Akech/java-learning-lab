package SphereCalculator;

import java.util.Scanner;

public class SphereCalculator {
    public static void main(String[] args){
    double radius;
    double circumference;
    double area;
    double volume;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    radius = scanner.nextDouble();

    System.out.print("What is the circumference?: ");
    circumference = Math.round(Math.PI * radius);

    System.out.print("What is the area?: ");
    area = Math.round(Math.PI * Math.pow(radius, 2));

    System.out.print("What is the volume?: ");
    volume = Math.round((4.0/3.0) * (Math.PI * Math.pow(radius, 3)));

    System.out.println("The circumference is " + circumference + "cm");
    System.out.println("The area is " + area + "cm²");
    System.out.println("The volume is " + volume + "cm³");

    scanner.close();
    }   
}
