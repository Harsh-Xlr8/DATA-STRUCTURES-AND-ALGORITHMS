package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class countDigits {
    public static void main(String[] args) {
        System.out.println(countDig(23562));
    }
    static int countDig(int n){
        int count=0;
        int N = n;
        while(N>0){
            N = N/10;
            count++;
        }
        return count;
    }
}
