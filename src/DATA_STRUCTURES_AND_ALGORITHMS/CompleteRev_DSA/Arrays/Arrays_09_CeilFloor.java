package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

public class Arrays_09_CeilFloor {
    public static void main(String[] args) {
        int[] arr = {12,23,26,29,34,45,67,69};
        int k = 68;
        search(arr,k);
    }
    static void search(int[] arr,int k){
        int low = 0;  int high = arr.length-1;
        int ceil = 0;  int floor = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(k>arr[mid]){
                low = mid+1;
                floor = arr[mid];
            }else if(k<arr[mid]){
                high = mid-1;
                ceil = arr[mid];
            }else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(floor+" "+ceil);
    }
}
