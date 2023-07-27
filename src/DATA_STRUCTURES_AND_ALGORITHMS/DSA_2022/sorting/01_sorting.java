package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;
import java.util.*;
import java.lang.*;

class Sorting_01 {
    public static void main(String [] args){
     //Java program to sort an array.
        int arr[] = {1,5,2,4,8,4};
     //   Arrays.sort(arr);
     Arrays.sort(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
}
