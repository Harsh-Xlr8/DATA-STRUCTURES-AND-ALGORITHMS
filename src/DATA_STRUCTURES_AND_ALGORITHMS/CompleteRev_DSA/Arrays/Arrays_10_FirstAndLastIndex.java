package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

public class Arrays_10_FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,3,4,4};
        int k = 3;
        firstIndex(arr,k);
        lastIndex(arr,k);
    }
    static void lastIndex(int[] arr,int k){
        int low = 0;
        int high = arr.length-1;
        int lidx = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(k>arr[mid]){
                low = mid+1;
            }else if(k<arr[mid]){
                high = mid-1;
            }else{
                lidx = mid;
                low = mid+1;
            }
        }
        System.out.println(lidx);
    }
    static void firstIndex(int[] arr,int k){
        int low = 0;
        int high = arr.length-1;
        int fidx = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(k>arr[mid]){
                low = mid+1;
            }else if(k<arr[mid]){
                high = mid-1;
            }else{
                fidx = mid;
                high = mid-1;
            }
        }
        System.out.println(fidx);
    }
}
