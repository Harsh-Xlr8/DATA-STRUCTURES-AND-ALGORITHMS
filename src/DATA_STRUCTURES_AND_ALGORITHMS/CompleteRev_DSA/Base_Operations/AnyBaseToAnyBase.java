package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Base_Operations;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        System.out.println(convert(563,10,8));
    }
    static int convert(int n,int b1,int b2){
        int rv=0;
        int pos=1;
        while(n>0){
            int dig = n%b1;
            n = n/b1;
            rv+=dig*pos;
            pos = pos*b2;
        }
        return rv;
    }
}
