package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
    }
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
