
import java.util.Scanner;  // Scanner class

public class studentgradecalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // initialize scanner class to take input

        System.out.println("Enter the number of Subjects: ");
        int subjs = sc.nextInt(); // No. of subjects to be calculated
        sc.nextLine(); // consuming next line to avoid input issues

        String[] subjnames = new String[subjs];  // array to store subjects
        int[] marks = new int[subjs]; // array to store marks
        int totalmarks = 0; //traking marks initialize it as 0

        for (int i = 0; i < subjs; i++) {
            System.out.println("Enter your subjects name: ");
            subjnames[i] = sc.nextLine(); // store subject names inside i

            while (true) { // infinite loop for input validation

                System.out.println("Enter marks for" + subjnames[i] + "(Out of 100)");
                marks[i] = sc.nextInt();
                sc.nextLine();

                if (marks[i] >= 0 && marks[i] <= 100) { // validate marks in range 1 to 100
                    break;
                } else {
                    System.out.println("Invalid Marks! Please enter your marks between 1 to 100");
                }
            } // will only get out of the loop if the marks are in range of 1 - 100

            totalmarks += marks[i]; // add to total marks

        }

        double avgper = (double) totalmarks / subjs; //compute average percentage. Use double to avoid int division

        char grade;
        
        // assign grade based on marks
        if (avgper >= 90) {
            grade = 'A';
        } else if (avgper >= 80) {
            grade = 'B';
        } else if (avgper >= 70) {
            grade = 'C';
        } else if (avgper >= 60) {
            grade = 'D';
        } else if (avgper >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println(" Subject wise Marks: ");

        for (int i = 0; i < subjs; i++) {
            System.out.println(subjnames[i] + " : " + marks[i]);
        }
        // print total marks, average percentage, grade
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Marks: " + avgper + "%");
        System.out.println("Grade: " + grade);
        sc.close(); //close scanner

    }
}