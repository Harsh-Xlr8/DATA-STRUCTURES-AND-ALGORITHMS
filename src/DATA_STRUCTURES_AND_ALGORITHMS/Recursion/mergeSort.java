package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

import java.util.Arrays;

public class mergeSort {
//    static int[] MergeSort(int[] arr){
//        if(arr.length == 1)  return arr;
//        int mid = arr.length/2;
//        int[] left = MergeSort(Arrays.copyOfRange(arr,0,mid));
//        int[] right = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
//        return merge(left,right);
//    }
//    static int[] merge(int[] a,int[] b){
//
//        int i=0,j=0,k=0;
//        int[] ans = new int[a.length+b.length];
//        while(i<a.length && j< b.length){
//            if(a[i] <= b[j])
//            {  ans[k++] = a[i++];  }
//            else{  ans[k++] = b[j++]; }
//            while(i<a.length){
//                ans[k++] = a[i++];
//            }while(j<b.length){
//                ans[k++] = b[j++];
//            }
//        }
//      return ans;
//    }
// At every level N elements are being merged.    TIME COMPLEXITY = O(N log n)    space = O(n)

    //   IN PLACE MERGESORT
    static void INPLACEMergeSort(int[] arr,int s,int e){
        if(e-s == 1)  return;
        int mid = (s+e)/2;
         INPLACEMergeSort(arr,s,mid);
         INPLACEMergeSort(arr,mid,e);
         Merge(arr,s,mid,e);
    }
    static void Merge(int[] arr,int s,int mid,int e){
        int i=s,j=mid,k=0;
        int[] ans = new int[e-s];
        while(i<mid && j< e){
            if(arr[i] <= arr[j])
            {  ans[k++] = arr[i++];  }
            else{  ans[k++] = arr[j++]; }
            while(i<mid){
                ans[k++] = arr[i++];
            }while(j<e){
                ans[k++] = arr[j++];
            }
        }
        System.arraycopy(ans, 0, arr, s , ans.length);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,7,6,8};
        INPLACEMergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
