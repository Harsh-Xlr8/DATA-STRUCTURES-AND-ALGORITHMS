package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NGEApproach2 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5,6,1};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
    static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[i] > arr[st.peek()]){
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size() >0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
}
