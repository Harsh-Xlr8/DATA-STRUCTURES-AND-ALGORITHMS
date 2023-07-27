package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

import java.util.Arrays;

public class Arrays_05_inverse {
    public static void main(String[] args) {
      int[] arr = {1,4,3,0,2,5};
        inverse(arr);
    }
    static void inverse(int[] arr){
        int[] res = new int[arr.length];
       for(int i=0;i<arr.length;i++){
           int v = arr[i];
           res[v] = i;
       }
        System.out.println(Arrays.toString(res));
    }
}
