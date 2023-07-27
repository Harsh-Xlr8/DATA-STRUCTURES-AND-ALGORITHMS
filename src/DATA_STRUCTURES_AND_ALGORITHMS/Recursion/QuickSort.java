package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,6,7};
        quicksort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));

    }
    static void quicksort(int[] arr,int low,int high){
        if(low >= high)  return;
        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = arr[m];
        while(s<=e){
           while(arr[s] < pivot){
                s++;
            }
           while(arr[e] >pivot){
               e--;
           }
           if(s<=e){
               int temp = arr[s];
               arr[s] = arr[e];
               arr[e] = temp;
               s++;
               e--;
           }
        }// Now my pivot is at correct position and time to call recursive function to sort the two halves.
        quicksort(arr,low,e);
        quicksort(arr,s,high);
    }
}
