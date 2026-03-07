import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("<-- Calculator -->");

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;

            case '/' -> {
                if(num2 == 0) {
                    System.out.println("Cannot divide a number by zero!");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }

            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("Invalid Operator");
                validOperator = false;
            }
        }

        if(validOperator){
            System.out.println("The result is " + result);
        }

        scanner.close();
    }
}
