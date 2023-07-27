package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

import java.util.Arrays;

public class Arrays_04_reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
    }
    static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
