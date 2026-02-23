class SumCalculator {
    int sum = 0;
    int num = 100;

    public int add() {
        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
public class SumOfNumbers {
    public static void main(String[] args) {

        SumCalculator calculator = new SumCalculator();
        int result = calculator.add();

        System.out.println("The sum of numbers ( 1 - 100 is: " + result);

        // int sum = 0;
        // int num = 100;

        // for(int i = 1; i <= num; i ++){
        //     sum += i;
        // }
        // System.out.println("The sum of " + num + " is " + sum);
    }
}
