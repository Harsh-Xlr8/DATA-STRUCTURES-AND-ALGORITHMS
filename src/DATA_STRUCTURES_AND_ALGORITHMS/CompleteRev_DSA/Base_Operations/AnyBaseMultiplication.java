package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Base_Operations;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        System.out.println(finalProduct(21,34,8));
    }
    static int finalProduct(int n1,int n2,int b){
        int res = 0;
        int p = 1;
        while(n2 > 0){
            int d2 = n2%10;
            n2 = n2/10;
            int sprd = multiplySingleDig(b,n1,d2);
            res = add(res,sprd*p,b);
            p = p*10;
        }

        return res;
    }
    static int multiplySingleDig(int b, int n1,int dn2){
        int res=0;
        int c = 0;
        int p = 1;
        while(n1 > 0 || c > 0){
            int d1 = n1%10;
            n1 = n1/10;
            int dig = d1*dn2+c;
            c = dig/b;
            dig = dig%b;
            res += dig*p;
            p = p*10;
        }

        return res;
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
