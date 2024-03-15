package questions;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number");
            int n = sc.nextInt();
            
            int sum = 0;
            int temp = n;
            int sqr = n*n;
            int digit = 0;

            while (n>0) {
                digit = sqr % 10;
                sum += digit;
                n = sqr/10;
                sqr = n;
            }
            if (temp == sum) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
