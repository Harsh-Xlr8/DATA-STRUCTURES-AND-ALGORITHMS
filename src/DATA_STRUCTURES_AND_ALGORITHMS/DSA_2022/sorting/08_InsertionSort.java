package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

class InsertionSort {
static void Insertion(int arr[], int n){
    for(int i=1;i<n;i++){
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
public static void main(String[] args){
    int arr[] = {1,4,2,6,7},n=5;
    Insertion(arr,n);
    for(int x:arr){ /*here the statement for(int i:arr) is a new type of for loop called for each loop.
        what it does is , it assign the value of i according to the element present in array arr[]*/
        System.out.print(x+" ");
    }
}
}
