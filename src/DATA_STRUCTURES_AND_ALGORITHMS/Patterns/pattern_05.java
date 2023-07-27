package DATA_STRUCTURES_AND_ALGORITHMS.Patterns;

public class pattern_05 {
    public static void main(String[] args) {
    pattern5(9);
    }
    static void pattern5(int n){
     for(int r=0;r<2*n;r++){
         int totalcolcount = r>n ? 2*n-r : r;
         int space = n-totalcolcount;
         for(int s=0;s<space;s++){
             System.out.print(" ");
         }
         for(int c=0;c<totalcolcount;c++){
             System.out.print("* ");
         }
         System.out.println();
     }
    }
}
