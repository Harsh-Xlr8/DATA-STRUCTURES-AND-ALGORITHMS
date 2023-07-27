package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class GCDandLCM {
    public static void main(String[] args) {
    GCD(12,20);
    }
    static void GCD(int a ,int b){
        int oa = a;
        int ob = b;
        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println(b);
        // GCD * LCM = a*b
        // LCM = (a*b)/GCD
        int LCM = (oa*ob)/b;
        System.out.println(LCM);
    }

}
