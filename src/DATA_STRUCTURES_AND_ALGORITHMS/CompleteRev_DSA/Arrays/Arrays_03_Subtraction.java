package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;


public class Arrays_03_Subtraction {
    public static void main(String[] args) {
        int[] arr1 = {3,0,0};
        int[] arr2 = {2,9,0};
        sub(arr1, arr2);
    }
    static void sub(int[] arr1,int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] res = new int[m];
        int i = m-1;  int j = n-1;
        int k = m-1;
        int c=0;
        while(k>=0){
            int d;
            int a2v = j>=0 ? arr2[j] : 0;
            if(arr1[i] >= a2v){
                d = arr1[i]+c-a2v;
            }else{
                d = arr1[i]+c+10-a2v;
                c = -1;
            }
            res[k] = d;
            k--;
            i--;
            j--;
        }
        int idx=0;
        while(idx<res.length){
            if(res[idx] == 0){
                idx++;
            }else{
                break;
            }
        }
        while(idx<res.length){
            System.out.print(res[idx]+" ");
            idx++;
        }
    }
}
