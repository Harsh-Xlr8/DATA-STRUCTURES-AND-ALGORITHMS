package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

public class countZeroes {
    public static void main(String[] args) {
        int n = 1020300;
        System.out.println(countZeros(n));
    }
    static int countZeros(int n){
        return helper(n,0);
    }
    private static int helper(int n,int c){
        if(n==0) return c;
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }

}
