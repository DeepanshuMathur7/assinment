package questions;

import java.util.Scanner;

public class reverseOfDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number:");
            int n = sc.nextInt();

            while (n>0) {
                int digit = n%10;
                System.out.print(digit);
                n = n/10;
            }
        }
    }
}
