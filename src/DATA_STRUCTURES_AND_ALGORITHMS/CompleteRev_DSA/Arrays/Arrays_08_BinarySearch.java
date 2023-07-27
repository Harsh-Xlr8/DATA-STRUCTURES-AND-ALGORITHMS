package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

public class Arrays_08_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9,16};
        int k = 7;
        System.out.println(BinarySearch(arr,k));
    }
    static int BinarySearch(int[] arr,int k){
        int low=0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(k == arr[mid])  return mid;
            else if(k > arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
