package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

public class Level_1 {
    public static void main(String[] args) {
   funRev(5);
    }
    static void funRev(int n){
        if(n==0) return;
        funRev(n-1);
        System.out.println(n);
    }
    static void funStr(int n){
        if(n==6) return;
        System.out.println(n);
        funStr(n-1);
    }
}
