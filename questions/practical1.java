package questions;

import java.util.Scanner;

public class practical1 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            // Area of a square
            System.out.println("Enter side");
            int a = s.nextInt();
            System.out.println("Area : "+(a*a)+"\nPerimeter : "+(4*a));
        }
    }
}
