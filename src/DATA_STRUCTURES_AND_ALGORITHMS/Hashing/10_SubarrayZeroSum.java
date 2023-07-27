package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;
import java.util.*;
class SubarrayZeroSum {
    static boolean zeroSubSum(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        int pre_sum=0;
        for (int j : arr) {
            pre_sum += j;
            if (s.contains(pre_sum))
                return true;
            if (pre_sum == 0)
                return true;
            s.add(pre_sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {13,14,43,-3,-87,90};
        System.out.println(zeroSubSum(arr));
    }
}
