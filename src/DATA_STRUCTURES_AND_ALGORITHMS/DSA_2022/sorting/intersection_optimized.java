package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

public class intersection_optimized {
    static void Intersection(int a[],int b[],int m,int n){
        int i=0,j=0;
        while(i<m && j<n){
        if(i>0 && a[i-1]==a[i])
        { i++;  continue; }
        if(a[i]<b[j]){   i++; }
        else if(a[i]>b[j]){ j++; }
        else{System.out.print(a[i]+" "); i++; j++; }
    }}
    public static void main(String[] args){
        int a[] = new int[]{3,5,5,6,6,10,20};
        int b[] = new int[]{1,3,7,9,9,10};
        int m = a.length;
        int n = b.length;
        Intersection(a,b,m,n);
    }
}
