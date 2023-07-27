package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;


import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        String s = "(a+b)+((a-b))";
        System.out.println(duplicate(s));
    }
    static boolean duplicate(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    return true;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        return false;
    }
}
