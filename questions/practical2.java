package questions;

import java.util.Scanner;

public class practical2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input marks for three subjects
            System.out.print("Enter marks for Subject 1: ");
            int subject1 = scanner.nextInt();

            System.out.print("Enter marks for Subject 2: ");
            int subject2 = scanner.nextInt();

            System.out.print("Enter marks for Subject 3: ");
            int subject3 = scanner.nextInt();

            // Calculate total marks
            int totalMarks = subject1 + subject2 + subject3;

            // Calculate percentage
            double percentage = (double) totalMarks / 300 * 100;

            // Display results
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
        }
    }
}
