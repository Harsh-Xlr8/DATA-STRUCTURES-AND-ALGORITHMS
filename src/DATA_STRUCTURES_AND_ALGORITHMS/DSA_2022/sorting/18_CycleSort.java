package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

import java.util.Arrays;

class CycleSort {
  static void sort(int[] arr){
int i=0;
while(i<arr.length){
    int correctP = arr[i] - 1;
    if(arr[i] != arr[correctP]){
        int temp = arr[i];
        arr[i] = arr[correctP];
        arr[correctP] = temp;
    }else{ i++; }
}
  }

  public static void main(String[] args) {
   int[] arr = new int[]{2,4,5,3,1};
   sort(arr);
   System.out.print(Arrays.toString(arr));
  }
}
