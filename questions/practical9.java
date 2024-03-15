package questions;

import java.util.Scanner;

public class practical9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String inputString = scanner.nextLine();

            int vowels = 0;
            int consonants = 0;
            int digits = 0;
            int whitespace = 0;

            inputString = inputString.toLowerCase();

            for (int i = 0; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else if ((ch >= 'a' && ch <= 'z')) {
                    consonants++;
                } else if (ch >= '0' && ch <= '9') {
                    digits++;
                } else if (ch == ' ') {
                    whitespace++;
                }
            }

            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
            System.out.println("Number of digits: " + digits);
            System.out.println("Number of whitespace characters: " + whitespace);
        }
    }
}
