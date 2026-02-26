public class Calculator {
    public static void main(String[] args) {
        // Decalre variables
        double num1 = 70.0;
        double num2 = 30.0;
        char operator = '%';
        double result = 0;

        // switch through the operators
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Invalid results");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
