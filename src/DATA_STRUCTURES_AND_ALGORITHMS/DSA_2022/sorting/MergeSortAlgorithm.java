package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;
import java.lang.*;
public class MergeSortAlgorithm {
static void merge(int a[],int l,int m, int h){
    int n1 = m-l+1,n2 = h-m;
    int left[] = new int[n1];
    int right[] = new int[n2];
    for(int i=0;i<n1;i++){left[i] = a[l+i];}
    for(int i=0;i<n2;i++){right[i] = a[(m+1)+i];}
    int i=0,j=0,k=l;
    while(i<n1 && j<n2){
        if(left[i]<=right[j]){a[k++] = left[i++];}
        else{
            a[k++] = right[j++];
        }
    }
       while(i<n1){a[k++]= left[i++];}
       while(j<n2){a[k++]= right[j++];}

}static void mergeSort(int a[],int l,int h){
    if(h>l){
        int m = l+(h-l)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,h);
        merge(a,l,m,h);
    }
    }
    public static void main(String[] args){
        int a[] = new int[]{10,5,30,15,7};
        int l=0,r=4;

        mergeSort(a,l,r);
        for(int x: a)
            System.out.print(x+" ");
    }

}
