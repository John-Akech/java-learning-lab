package Telephone2DArray;

public class Telephone2DArray {
    public static void main(String[] args) {
        char[][] Telephone = {{'1', '2', '3'}, 
                              {'4', '5', '6'},
                              {'7', '8', '9'}, 
                              {'*', '0', '#'}};
        
        for(char[] tel : Telephone){
            for(char number : tel){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    
}
