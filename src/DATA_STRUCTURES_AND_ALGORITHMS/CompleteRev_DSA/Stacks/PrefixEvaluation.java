package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String s = "+ab";
        Stack<String> postfix = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<Integer> value = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = value.pop();
                int v1 = value.pop();
                int v = operations(v1,v2,ch);
                value.push(v);

                String pv1 = postfix.pop();
                String pv2 = postfix.pop();
                String pv = pv1+pv2+ch;
                postfix.push(pv);

                String iv1 = infix.pop();
                String iv2 = infix.pop();
                String iv = "("+iv1+ch+iv2+")";
                infix.push(iv);
            }else{
                value.push(ch -'0');
                infix.push(ch+"");
                postfix.push(ch+"");
            }
        }
        System.out.println(value.pop());
        System.out.println(postfix.pop());
        System.out.println(infix.pop());

    }
    static int operations(int v1,int v2, char op) {
        if (op == '+') {
            return v1+v2;
        } else if (op == '-') {
            return v1-v2;
        } else if (op == '*') {
            return v1*v2;
        } else {
            return v1/v2;
        }
    }
}
