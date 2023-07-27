package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

import java.lang.*;

class Lomuto_Partition {
static void lPartition(int arr[],int l,int h) {
    int pivot = arr[h];
    int i = l - 1;
    for (int j = 0; j < h; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;

    }
}
    public static void main (String[] args)
    {
        int arr[] = new int[]{10,80,30,90,40,50,70};

        int n = arr.length;
        lPartition(arr,0,n-1);

     for(int x:arr)
         System.out.print(x+" ");

    }
}
