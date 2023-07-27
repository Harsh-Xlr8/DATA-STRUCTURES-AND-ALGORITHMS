package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class DigitFrequency {
    public static void main(String[] args) {
        freq(2427229,2);
    }
    static void freq(int n,int k) {
        int count = 0;
        while (n > 0) {
            int dig = n%10;
            n = n/10;
            if (dig == k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
