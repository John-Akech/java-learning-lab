package QuizGame;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score = 0;
        char guess;

        String[] questions = {
                "1. What does JVM stand for?",
                "2. Which keyword is used to create a class in Java?",
                "3. Which method is the entry point of a Java program?",
                "4. Which of these is used to print output in Java?",
                "5. Which symbol is used to end a statement in Java?",
                "6. Which data type is used to store whole numbers in Java?",
                "7. Which data type is used to store true or false values?",
                "8. Which keyword is used to make a variable constant in Java?",
                "9. Which operator is used for comparison in Java?",
                "10. Which loop is best when you know how many times to repeat?"
        };

        String[][] options = {
                {"A. Java Variable Method", "B. Java Virtual Machine", "C. Joint Virtual Machine", "D. Java Verified Machine"},
                {"A. define", "B. create", "C. class", "D. new"},
                {"A. Start()", "B. run()", "C. main()", "D. init()"},
                {"A. echo()", "B. print()", "C. System.out.println()", "D. console.log()"},
                {"A. :", "B. ;", "C. .", "D. ,"},
                {"A. float", "B. int", "C. char", "D. boolean"},
                {"A. String", "B. int", "C. boolean", "D. char"},
                {"A. static", "B. final", "C. const", "D. fixed"},
                {"A. =", "B. ==", "C. :=", "D. !=>"},
                {"A. while", "B. do-while", "C. for", "D. if"}
        };

        char[] answers = {'B', 'C', 'C', 'C', 'B', 'B', 'C', 'B', 'B', 'C'};

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = Character.toUpperCase(scanner.next().charAt(0));

            if (guess == answers[i]) {
                System.out.println("CORRECT!");
                score++;
            } else {
                System.out.println("INCORRECT! The correct answer is " + answers[i]);
            }
        }

        System.out.println("\nYour final score is " + score + " out of " + questions.length);
        double percentage = (score * 100.0) / questions.length;
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}