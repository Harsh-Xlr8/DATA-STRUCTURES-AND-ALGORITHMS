package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

import java.util.Arrays;

public class Arrays_04_Rotate {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    int k = 3;
        rotate(arr,k);
    }
    // To rotate given array with k positions remember this:
    // If k is less than 0 then just subtract that with length of the array i.e. for -1 rotation of 4 int an array of length 5 is same.
    // If k is greater than the length of the array then take mod k = k % array length i.e. 6 is same as rotation of 1.
    // Now to rotate an array break it in two halves according to k. Then reverse both halves.
    // At last reverse the complete array.
    static void rotate(int[] arr,int k) {
    k = k%arr.length;
        if(k<0){
        k = arr.length+k;
    }
    reverse(arr,0,arr.length-k-1);
    reverse(arr,arr.length-k,arr.length-1);
    reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;}
    }
}
