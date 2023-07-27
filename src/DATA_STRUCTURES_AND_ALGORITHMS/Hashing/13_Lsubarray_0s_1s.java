package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;
import java.util.HashMap;

class Lsubarray_0s_1s {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
        int len = arr.length;

        System.out.println(largestZeroSubArray(arr));
    }

    static int largestZeroSubArray(int[] arr) {
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                sum+=-1;
            }else{
                sum+=1;
            }
            if(map.containsKey(sum)){
                int index = map.get(sum);
                int len = i-index;
                if(len>sum){
                    ans = len;}
            }
            else{
                map.put(sum,i);
        }
        }

        return ans;
    }
}
