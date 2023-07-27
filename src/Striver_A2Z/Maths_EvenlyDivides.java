package Striver_A2Z;

public class Maths_EvenlyDivides {
    static int evenlyDivides(int N){
      int count=0;
      int n = N;
      while(n!=0){
          int digit = n%10;
          if(digit!=0 && N%digit==0){
               count++;
               n = n/10;
          }
      }
      return count;
    }
    public static void main(String[] args) {
        int N = 24;
        System.out.println(evenlyDivides(N));
    }
}
