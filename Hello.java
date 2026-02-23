class Calculator {
    int num1 = 4;
    int num2 = 6;

    public int add() {
        int result = num1 + num2;
        return result; 
    }
}

public class Hello {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add();
        System.out.println("Returned value: " + result);
    }
}