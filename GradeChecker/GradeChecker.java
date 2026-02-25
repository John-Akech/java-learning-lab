public class GradeChecker {
    public static void main(String[] args) {

        int mark1 = 85;
        int mark2 = 98;
        int mark3 = 91;
        int mark4 = 74;
        int mark5 = 80;

        int sum = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = sum / 5.0;

        char grade;

        // if-else statement for range logic)
        if (average <= 100 && average >= 85) {
            grade = 'A';
        } else if (average <= 84 && average >= 79) {
            grade = 'B';
        } else if (average <= 78 && average >= 65) {
            grade = 'C';
        } else if (average <= 64 && average >= 50) {
            grade = 'D';
        } else if (average <= 59 && average >= 45) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // switch sstatement for grade description
        switch (grade) {
            case 'A':
                System.out.println("Excellent performance");
                break;
            case 'B':
                System.out.println("Very good performance");
                break;
            case 'C':
                System.out.println("Good performance");
                break;
            case 'D':
                System.out.println("Satisfactory performance");
                break;
            case 'E':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }

        System.out.println("Total Marks: " + sum);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Assigned Grade: " + grade);
    }
}