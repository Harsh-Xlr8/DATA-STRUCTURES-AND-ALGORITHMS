package DATA_STRUCTURES_AND_ALGORITHMS.Patterns;

public class pattern_02 {
    public static void main(String[] args) {
     pattern3(6);
    }
    static void pattern3(int n){
            for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
