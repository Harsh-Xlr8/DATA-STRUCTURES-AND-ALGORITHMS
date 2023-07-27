package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;
import java.util.*;
import java.lang.*;

class MergeSort_NaiveMethod {
static void MergeSort(int a[], int b[],int m, int n){
    int c[] = new int[m+n];
    for(int i=0;i<m;i++)
        c[i] = a[i];
    for(int j=0;j<n;j++)
        c[m+j] = b[j];
    Arrays.sort(c);
    for(int i=0;i<m+n;i++){
        System.out.print(c[i]+" ");
    }
}

    public static void main(String[] args) {
        int a[]= new int[]{1,2,3,4,5};
        int b[]= new int[]{7,8,9};
        int m = a.length;
        int n = b.length;
        MergeSort(a,b,m,n);
    }
}
