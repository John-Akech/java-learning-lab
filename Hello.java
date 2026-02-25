public class Hello {
    public static void main(String[] args) {
        //  Declaring a 2D Array
        int [][] arr;

        // Creating the 2D Array

        arr = new int[3][4];

        // Filling the Array Using Nested Loops

        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 4; j ++){
                arr[i][j] = (int)(Math.random() * 10);
            }
        }
        // Printing the 2D Array (Enhanced For Loop)
        for(int [] n : arr) {
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}