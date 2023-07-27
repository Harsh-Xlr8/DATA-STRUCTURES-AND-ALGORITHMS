package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class inverseOfNum {
    public static void main(String[] args) {
        inverseNum(651243);
        System.out.println(inverse(18725463));
    }

    // INVERSE OF A NUMBER num = 15423  Inverse num = 52134
    static void inverseNum(int n) {
        int inv = 0;
        int op = 1;
        while (n != 0) {
            int od = n % 10;
            int id = op;
            // make change to inverse using id and ip
            inv += (id * (int) Math.pow(10, od - 1));
            op++;
            n = n / 10;
        }

        System.out.println(inv);

    } // simpler way to do it.

    public static int inverse(int n){
        int res = 0;
        int pos = 1;
        while(n > 0){
            int dig = n%10;
            n = n/10;
            res += pos*(int)Math.pow(10,dig-1);
            pos++;
        }
        return res;
    }
}
