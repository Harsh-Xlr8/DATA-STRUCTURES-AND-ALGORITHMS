package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

public class Arrays_12_LongSSKOptimized {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;
        System.out.print(lenOfLongSubArr(arr,k));
    }
    static int lenOfLongSubArr (int[] arr, int k) {
     long sum = arr[0];
     int n = arr.length;
     int maxLen = 0;
     int left=0,right=0;
     while(right<n){                             // Time Complexity = O(N)   Space = O(1)
         while(left<=right && sum>k){
             sum-=arr[left];
             left++;
         }
         right++;
         if(right<n)   sum+=arr[right];
         if(sum == k) maxLen = Math.max(maxLen,right-left+1);
     }
   return maxLen;
    }

}
