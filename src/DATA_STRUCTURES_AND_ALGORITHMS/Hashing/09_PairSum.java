package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;
import java.util.*;
class PairSum {
    static boolean pairsum(int[] arr,int sum){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(s.contains(sum-arr[i]))
            return true;
            s.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {13,14,43,56,87,90};
        int sum=103;
        System.out.println(pairsum(arr,sum));
    }
}
