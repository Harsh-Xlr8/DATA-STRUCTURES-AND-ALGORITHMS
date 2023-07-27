package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

public class Arrays_07_subsets {
    public static void main(String[] args) {
     int[] arr = {1,2,3};
        subset(arr);
    }
    // subset means each element has choice to print or don't print i.e. ab -> _ _ , a b , a _ , _ b  for n elements there are 2^n subsets.
    static void subset(int[] arr){
        int limit = (int)Math.pow(2,arr.length);
        for(int i=0;i<limit;i++){
            String s = " ";
            int temp  = i;

            // Convert i to binary and use 0's and 1's to know if to print the element or not.
            // running loop j in reverse order to maintain the correct position of binary transformed element.
            // adding "_" or arr[j] before s is also for the above reason.

            for(int j = arr.length-1;j>=0;j--){
                int r = temp%2;
                temp = temp/2;
                if(r==0){
                    s = "_ " + s;
                }else{
                    s = arr[j] + " " + s;
                }
            }
            System.out.println(s);
        }
    }
}
