package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        System.out.print(Arrays.toString(Sspan(arr)));
    }
    static int[] Sspan(int[] arr){
        int n = arr.length;
        int[] span = new int[n];
        span[0] = 1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                span[i] = i+1;
            }else{
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        return span;
    }
}
