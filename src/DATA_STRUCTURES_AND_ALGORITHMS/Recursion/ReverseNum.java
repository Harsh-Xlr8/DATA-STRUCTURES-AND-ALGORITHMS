package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

public class ReverseNum {
static int sum=0;
static void reverse(int n){
    if(n==0)  return;
    int rem = n%10;
    sum = sum*10+rem;
    reverse(n/10);
}
static int reverseNum2(int n){
    int digits = (int)Math.log10(n)+1;
    return helper(n,digits);
}
public static int helper(int n , int digits){
    if(n%10 == n) return n;
    int rem = n%10;
    return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
}
static boolean palindome(int n){
    return n==reverseNum2(n);
}
    public static void main(String[] args) {
    int n = 12344321;
        System.out.println(palindome(n));
    }
}
