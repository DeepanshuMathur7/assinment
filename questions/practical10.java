package questions;

import java.util.Scanner;

public class practical10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String st = sc.nextLine();
            boolean pali = true;
            for(int i=0; i<(st.length()/2);i++){
                if(st.charAt(i)!=st.charAt(st.length()-1-i)){
                    pali = false;
                    break;
                }
            }
            System.out.println(pali);
        }
    }
}
