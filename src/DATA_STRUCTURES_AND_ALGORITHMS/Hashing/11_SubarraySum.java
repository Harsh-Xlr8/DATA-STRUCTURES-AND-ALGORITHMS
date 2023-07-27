package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;

import java.util.HashSet;

class SubarraySum {
    static boolean isSum(int[] arr,int sum){
        HashSet<Integer> s  = new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<arr.length;i++){
            if(pre_sum==0)
                return true;
            pre_sum+=arr[i];
            if(s.contains(pre_sum-sum))
                return true;
            s.add(pre_sum);
        }return false;
    }

    public static void main(String[] args) {
        int[] arr = {13,14,43,56,87,90};
        int sum=70;
        System.out.println(isSum(arr,sum));

    }
}
