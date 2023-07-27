package Striver_A2Z;

public class Maths_CheckPalindrome {
    static boolean isPalindrome(int N) {
        int reverse = 0;
        while (N > reverse) {
            int dig = N % 10;
            reverse = reverse*10+dig;
            N = N / 10;
        }
        return reverse == N;
    }
    public static void main(String[] args) {
        int N = 12344321;
        System.out.print(isPalindrome(N));
    }
}
