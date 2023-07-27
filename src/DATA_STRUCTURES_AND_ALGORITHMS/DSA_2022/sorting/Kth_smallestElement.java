package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

public class Kth_smallestElement {
    static int partition(int arr[],int l,int h) {
        int i = l - 1, j = h + 1;
        int pivot = arr[l];
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static int kthSmall(int arr[],int k){
        int n = arr.length;
        int lo = 0,h=n-1;
        while(lo<=h){
            int p = partition(arr,lo,h);
            if(p==k-1){
                return p;
            }else if(p>k-1){
                h=p-1;
            }else{
                lo=p+1;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,9,7,5,23,14};
        int n = arr.length;int k = 3;
        int index=kthSmall(arr,k);

        System.out.print(arr[index]);
    }
}
