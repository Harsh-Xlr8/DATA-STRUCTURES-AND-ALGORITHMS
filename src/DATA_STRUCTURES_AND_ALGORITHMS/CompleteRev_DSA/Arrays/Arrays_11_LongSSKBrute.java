package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

public class Arrays_11_LongSSKBrute {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int n = arr.length;
        int k = 15;
        System.out.print(lenOfLongSubArr(arr,n,k));
    }
    static int lenOfLongSubArr (int[] arr, int n, int k) {
        int res=0;
        for(int i=0;i<n;i++){
            int len=0;
            int sum=0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum == k){
                    len = Math.max(len,j-i+1);
                }
            }
            res = Math.max(res,len);
        }
        return res;
    }
}
