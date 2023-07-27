package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Base_Operations;
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        System.out.println(convert(563,8));
    }
static int convert(int n,int k){
        int rv = 0;
        int p = 1;
        while(n > 0){
         int dig = n%10;
         n = n/10;
         rv += dig*p;
         p = p*k;
        }
        return rv;
}
}
