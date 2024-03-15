package questions;

import java.util.Scanner;

public class practical6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call method to print prime factors
        printPrimeFactors(number);

        // Close the scanner
        scanner.close();
    }

    // Method to print prime factors of a number
    static void printPrimeFactors(int num) {
        System.out.print("Prime Factors of " + num + ": ");

        // Print 2s as long as num is divisible by 2
        while (num % 2 == 0) {
            System.out.print("2 ");
            num /= 2;
        }

        // Iterate from 3 to the square root of num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            // Print i as long as num is divisible by i
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        // If num is a prime greater than 2
        if (num > 2) {
            System.out.print(num);
        }
    }
}
