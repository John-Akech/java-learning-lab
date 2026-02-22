public class EvenNumbersPrinter {
    public static void main(String[] args) {
        // Even numbers printer
        for(int i = 1; i <= 100; i++){
            if(i%2 == 0){
                System.out.println(i + " Is an even number.");
            } else{
                continue;
            }
        }
        System.out.println("You have come to an end...");
    }
    
}
