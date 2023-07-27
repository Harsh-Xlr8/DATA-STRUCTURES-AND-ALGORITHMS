package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

class Naive_Partition {
static void partition(int arr[],int l,int h,int p) {

    int temp[] = new int[h - l + 1];
    int index = 0;
    for (int i = l; i <= h; i++) {
        if (arr[i] <= arr[p] && i != p) {
            temp[index] = arr[i];
            index++;
        }
    }
    temp[index++] = arr[p];
    for(int i=l;i<=h;i++){
        if(arr[i]>arr[p]){
            temp[index] = arr[i];
            index++;
        }
    }
    for (int i = l; i <= h; i++){
        arr[i] = temp[i-l];
        System.out.print(arr[i]+" ");
    }
    }
public static void main(String[] args){
    int arr[]  = new int[]{1,9,7,2,3,4};
    int n = arr.length;
    partition(arr,0,n-1,2);
    }
}
