package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;
import java.util.HashMap;

class Subsm{
   /* static int subsum(int[] a,int sum){
        int res=0;
        for(int i=0;i<a.length;i++){
            int curr_sum=0;
            for(int j=i;j<a.length;j++){         //NAIVE APPROACH
                curr_sum+=a[j];
                if(curr_sum==sum){
                    res = Math.max(res,j-i+1);
                }
            }
        }return res;
    }*/
    static int subsum(int[] a,int sum){
        HashMap<Integer,Integer> m = new HashMap<>();
        int pre_sum=0,res=0;
        for(int i=0;i<a.length;i++){
            pre_sum+=a[i];
            if(pre_sum==sum){res = i+1;}
            if(m.containsValue(pre_sum)==false){
                m.put(pre_sum,i);
            }
            if(m.containsValue(pre_sum-sum)){
                res=Math.max(res,i-(pre_sum-sum));
            }
        }return res;


    }
    public static void main(String[] args){
        int[] a = {1,4,2,6,5,2,7};
        int sum=13;
        System.out.print(subsum(a,sum));
    }
}
