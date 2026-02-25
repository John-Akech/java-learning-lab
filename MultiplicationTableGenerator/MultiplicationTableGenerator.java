public class MultiplicationTableGenerator {

    public static void main(String[] args) {

        // Base number for the multiplication table
        int number = 12;

        // Display table header
        System.out.println("Multiplication table of " + number);

        // Loop from 0 to 12 and generate results
        for (int i = 0; i <= 12; i++) {

            int result = number * i;

            // Print in multiplication format
            System.out.println(i + " x " + number + " = " + result);
        }
    }
}