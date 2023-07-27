package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;


import java.util.Stack;

public class PostfixExpressions {
    public static void main(String[] args) {
        String s = "12+";
        Stack<Integer> value= new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> infix = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '+' || ch == '-' || ch =='*' || ch =='/'){
                int v2 = value.pop();
                int v1 = value.pop();
                int v = operation(v1,v2,ch);
                value.push(v);

                String iv2 = infix.pop();
                String iv1 = infix.pop();
                String iv = "("+iv1+ch+iv2+")";
                infix.push(iv);

                String pv2 = prefix.pop();
                String pv1 = prefix.pop();
                String pv = ch+pv1+pv2;
                prefix.push(pv);
            }
            else{
                value.push(ch-'0');
                prefix.push(ch +"");
                infix.push(ch +"");
            }
        }
        System.out.println(value.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
    }
    static int operation(int v1, int v2, char op){
        if(op == '+'){
            return v1+v2;
        }else if(op == '-'){
            return v1-v2;
        }else if(op == '*'){
            return v1*v2;
        }else{
            return v1/v2;
        }
    }
}
