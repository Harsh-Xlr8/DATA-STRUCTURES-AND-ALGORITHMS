package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

class QuickSort_Lamuto {
static int lpart(int arr[],int l,int h){
    int i = l-1;
    int pivot = arr[h];
    for(int j=l;j<h;j++){
        if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
int temp = arr[i+1];
    arr[i+1] = arr[h];
    arr[h] = temp;
    return i+1;
}
static void QuickSort(int arr[],int l,int h){
    if(l<h){
        int p = lpart(arr,l,h);
        QuickSort(arr,l,p-1);
        QuickSort(arr,p+1,h);
    }
}
public static void main(String[] args){
    int arr[] = new int[]{8,4,7,9,3,10,5};
    int n = arr.length;
    QuickSort(arr,0,n-1);
    for(int x:arr){
        System.out.print(x+" ");
    }
}
}
