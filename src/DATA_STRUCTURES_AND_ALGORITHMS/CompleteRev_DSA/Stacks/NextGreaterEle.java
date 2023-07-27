package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterEle {
    public static void main(String[] args) {
   int[] arr = {2,4,1,3,5,6,1};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
    static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek())  {
                st.pop();
            }
            if(st.size()==0){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
         st.push(arr[i]);
        }
        return ans;
    }
}
