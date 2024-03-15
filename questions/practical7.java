package questions;

import java.util.Scanner;

public class practical7 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter range");
            int size=s.nextInt();
            System.out.println("Enter elements");
            int arr[]=new int[size];
            for ( int i=0;i<size;i++){
                arr[i]=s.nextInt();
            }
            int larger=arr[0];
            int smaller=arr[0];
            for(int i=0;i<size;i++){
                if(arr[i]>larger){
                larger = arr[i];
                }else if (arr[i] < smaller){
               smaller = arr[i];
                }
            }
            System.out.println("Larger number is "+ larger);
            System.out.println("Smaller number is "+ smaller);
        }
    }
}
