package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

import java.util.Stack;

public class InfixConversion {
    public static void main(String[] args) {
     String s = "a+b";
     Stack<String> prefix = new Stack<>();
     Stack<String> postfix = new Stack<>();
     Stack<Character> ops = new Stack<>();
     for(int i=0;i<s.length();i++){
         char ch = s.charAt(i);
         if(ch == '('){
             ops.push(ch);
         }else if((ch <= 'z' && ch >= 'a' || ch <= 'Z' && ch >= 'A' || ch <= '9' && ch >= '0' )){
            prefix.push(ch+"");
            postfix.push(ch+"");
         }else if(ch == ')'){
             while(ops.peek() != '('){
                 process(prefix,postfix,ops);
             }ops.pop();
         }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
             while(ops.size()>0 && ops.peek()!='(' && precedence(ch) <= precedence(ops.peek())){
             process(prefix,postfix,ops);
             }ops.push(ch);
         }
     } while(ops.size() > 0){
            process(prefix,postfix,ops);
        }
       System.out.println("Prefix Conversion: "+prefix.pop());
       System.out.println("Postfix Conversion: "+postfix.pop());
    }
    static int precedence(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }else{
            return 0;
        }
    }
    static void process(Stack<String> prefix,Stack<String> postfix,Stack<Character> ops){
        char op = ops.pop();
        String prev2 = prefix.pop();
        String prev1 = prefix.pop();
        String preV = op+prev1+prev2;
        prefix.push(preV);
        String postV2 = postfix.pop();
        String postV1 = postfix.pop();
        String postV = postV1+postV2+op;
        postfix.push(postV);
    }
}
