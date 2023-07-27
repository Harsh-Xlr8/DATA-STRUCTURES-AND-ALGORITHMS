package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Base_Operations;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        System.out.println(convert(563,8));
    }
    static int convert(int n,int k){
        int res = 0;
        int p = 1;
        while(n > 0){
            int dig = n%k;
            n = n/k;
            res+=dig*p;
            p = p*10;
        }
        return res;
    }
}
