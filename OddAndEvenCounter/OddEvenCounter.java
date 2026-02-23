class OddEvenCount {

    int oddCounter = 0;
    int evenCounter = 0;

    public void count() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
    }
}
public class OddEvenCounter {
    public static void main(String[] args) {

        OddEvenCount counter = new OddEvenCount();
        counter.count();
        
        System.out.println("Number of even numbers: " + counter.evenCounter);
        System.out.println("Number of odd numbers: " + counter.oddCounter);

        // int oddCounter = 0;
        // int evenCounter = 0;

        // for(int i = 1; i <= 100; i ++) {
        //     if(i % 2 == 0) {
        //         evenCounter ++;
        //     }
        //     else {
        //         oddCounter ++;
        //     }
        // }
        // System.out.println("Number of even numbers: " + evenCounter);
        // System.out.println("Number of odd numbers: " + oddCounter);
    }
}
