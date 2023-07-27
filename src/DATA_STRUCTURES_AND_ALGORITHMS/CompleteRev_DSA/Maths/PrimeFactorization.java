package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class PrimeFactorization {
    public static void main(String[] args) {
PrimeFac(1440);
    }
    static void PrimeFac(int n){
        for(int div=2;div*div<=n;div++){
            while(n%div==0){
                n = n/div;
                System.out.print(div+" ");
            }
            }
        // if div > root n then it means n is only prime factor now.
        if(n!=1){
            System.out.print(n);
        }
    }
}
