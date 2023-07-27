package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;

import java.util.HashSet;

class Longest_Subsequence_Subarray {

        static int Lsubsum(int[] arr){
            HashSet<Integer> s = new HashSet<>();
            for(int x:arr)
             s.add(x);
            int res=1;
            for(Integer x:s){
                if(!s.contains(x - 1)){
                    int curr=1;
                    while(s.contains(curr+1))
                        curr++;
                    res = Math.max(res,curr);
                }
            }return res;
        }

    public static void main(String[] args) {
        int[] a = {1,3,9,2,8};
        System.out.print(Lsubsum(a));
    }
}
