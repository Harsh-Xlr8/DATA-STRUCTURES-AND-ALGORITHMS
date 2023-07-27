package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

import java.util.Arrays;

public class Arrays_02_Addition {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,2,3,4,5};
        System.out.println(Arrays.toString(add(arr1, arr2)));
    }
    static int[] add(int[] arr1,int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int max = Math.max(m,n);
        int[] res = new int[max+1];
        int i = m-1;  int j = n-1;
        int k = max;
        int c = 0;
        while(k>=0 || c!=0){
            int d = c;
            if(i>=0){
                d+=arr1[i];
            }if(j>=0){
                d+=arr2[j];
            }c = d/10;
            d = d%10;
            res[k] = d;
            k--;
            i--;
            j--;
        }
        return res;
    }
}
