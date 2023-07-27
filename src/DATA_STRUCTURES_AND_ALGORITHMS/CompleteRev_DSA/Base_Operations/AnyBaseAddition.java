package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Base_Operations;

public class AnyBaseAddition {
    public static void main(String[] args) {
        System.out.println(add(236,564,8));
    }
   static int add(int n1,int n2,int b){
       int rv=0;
       int c=0;
       int p = 1;
       while(n1>0 || n2>0 || c>0){
           int d1 = n1%10;
           int d2 = n2%10;
           n1 = n1/10;
           n2 = n2/10;
           int d = d1+d2+c;
           c = d/b;     // taking quotient as carry
           d = d%b;     // taking remainder as spare value taken there to print
           rv += d*p;
           p = p*10;
       }
       return rv;
   }
}
