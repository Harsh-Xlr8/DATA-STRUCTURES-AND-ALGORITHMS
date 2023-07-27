package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

import java.util.ArrayList;

public class String_subsets {
    public static void main(String[] args) {
      //  subset("","abcd");
        System.out.println(subsetRet("","abcd"));
    }
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.print(p);
            System.out.println();
        return;}
        char ch = up.charAt(0);
       subset(p+ch,up.substring(1));
       subset(p,up.substring(1));
    }
    static ArrayList<String> subsetRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetRet(p+ch,up.substring(1));
        ArrayList<String> right = subsetRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
