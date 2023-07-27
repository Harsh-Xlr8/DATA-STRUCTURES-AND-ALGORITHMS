package Striver_A2Z;

public class Maths_CountDigits {
    public static int count(int N){
        int count=0;
        int digit=N;
        while(digit!=0){
            digit = digit/10;
            count++;
        }return count;
    }public static void main(String[] args){
        int N = 213456;
        System.out.print(count(N));
    }
}
