package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

import java.util.Stack;

public class SmallestNumberFollowingPattern {
    public static void main(String[] args) {
        String s = "ddidddid";
        int num = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'd'){
                stack.push(num);
                num++;
            }else{
                stack.push(num);
                num++;
                while(stack.size() > 0){
                    System.out.print(stack.pop()+" ");
                }
            }
        }
        stack.push(num);
        while(stack.size() > 0){
            System.out.print(stack.pop()+" ");
        }
    }
}
