package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Base_Operations;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        System.out.println(sub(256,1212,8));
    }
    static int sub(int n1,int n2,int b){
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n2 > 0){
         int d1 = n1%10;
         n1 = n1/10;
         int d2 = n2%10;
         n2 = n2/10;

         int dig=0;
         d2 = d2+c;
         if(d2>=d1){
             c = 0;
             dig = d2-d1;
         }else{
             c = -1;
             dig = (d2+b)-d1;
         }
         rv += dig*p;
         p = p*10;
        }
        return rv;
    }
}
