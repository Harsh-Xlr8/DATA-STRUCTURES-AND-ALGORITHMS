package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

import java.util.Stack;

public class InfixEvaluate {
    public static void main(String[] args) {
     String exp = "2*(5-3)/4";
     Stack<Integer> operands = new Stack<>();
     Stack<Character> operators = new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch = exp.charAt(i);
        if(ch == '('){
            operators.push(ch);
        }else if(Character.isDigit(ch)){
            operands.push(ch -'0');
        }else if(ch == ')'){
            while(operators.peek()!= '('){
                char op = operators.pop();
                int v2 = operands.pop();
                int v1 = operands.pop();
                int ops = operation(v1,v2,op);
                operands.push(ops);
            }operators.pop();
        }
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            while(operators.size()>0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){
                char op = operators.pop();
                int v2 = operands.pop();
                int v1 = operands.pop();
                int ops = operation(v1,v2,op);
                operands.push(ops);
            }
            operators.push(ch);
        }
    }
        while(operators.size() > 0){
            char op = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();
            int ops = operation(v1,v2,op);
            operands.push(ops);
        }
     System.out.println(operands.peek());

    }
    static int precedence(char operator){
        if(operator == '+')
            return 1;
        else if(operator == '-')
            return 1;
        else if(operator == '*')
            return 2;
        else
            return 2;
    }
    static int operation(int v1,int v2,char operator){
        if(operator == '+')
            return v1+v2;
        else if(operator == '-')
            return v1-v2;
        else if(operator == '*')
            return v1*v2;
        else
            return v1/v2;
    }

}
