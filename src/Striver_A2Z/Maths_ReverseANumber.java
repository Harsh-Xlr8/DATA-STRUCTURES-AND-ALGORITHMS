package Striver_A2Z;

import java.util.Scanner;

public class Maths_ReverseANumber {
    public static void reverse(int n){
        while(n>0){
            int digit = n%10;
            n = n/10;
            System.out.print(digit);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);

    }
}
