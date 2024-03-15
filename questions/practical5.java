package questions;

import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Call methods to find and print maximum and minimum
        printMaxNumber(num1, num2, num3);
        printMinNumber(num1, num2, num3);

        // Close the scanner
        scanner.close();
    }

    // Method to find and print the maximum number
    static void printMaxNumber(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Maximum Number: " + max);
    }

    // Method to find and print the minimum number
    static void printMinNumber(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        System.out.println("Minimum number " + min);
    }
}
