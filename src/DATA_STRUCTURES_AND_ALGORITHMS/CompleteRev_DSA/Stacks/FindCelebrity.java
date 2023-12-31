package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

import java.util.Stack;

public class FindCelebrity {
    public static void main(String[] args) {
        int[][] arr =  { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0} };
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        if(st.size() >= 2){
            int i = st.pop();
            int j = st.pop();
            if(arr[i][j] == 1){
                st.push(j);
            }else{
                st.push(i);
            }
        }
        int pot = st.pop();
        for(int i=0;i<arr.length;i++){
            if(i != pot){
                if(arr[i][pot] == 1|| arr[pot][i] == 0){
                    System.out.println(pot);
                    break;
                }else{
                    System.out.println("No Celebrity Found.");
                }
            }
        }

    }
}
