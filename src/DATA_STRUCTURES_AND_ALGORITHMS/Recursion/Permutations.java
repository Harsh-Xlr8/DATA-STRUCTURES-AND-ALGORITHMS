package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

public class Permutations {
    public static void main(String[] args) {
        subset("","abc");
    }
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.print(p);
            System.out.println();
            return;
        }
        char ch = up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }
}
