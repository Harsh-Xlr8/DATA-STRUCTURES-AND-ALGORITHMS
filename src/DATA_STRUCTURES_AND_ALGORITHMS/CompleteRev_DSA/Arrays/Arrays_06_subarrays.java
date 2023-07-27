package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

public class Arrays_06_subarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        subArray(arr);
    }
    static void subArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}
