package EmailSlicer;

import java.util.Scanner;

public class EmailSlicer {
        public static void main(String[] args){
        // Email slicer program

        //Declare variables
        String email;
        String username;
        String domain;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));

            System.out.println("Your user name is " + username);
            System.out.println("Your domain is " + domain);
        }else {
            System.out.println("Email must contain '@'");
        }

        scanner.close();
    }
}
