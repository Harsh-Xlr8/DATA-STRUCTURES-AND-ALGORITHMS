package DATA_STRUCTURES_AND_ALGORITHMS.Patterns;

public class pattern_01 {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2(int n){
        for(int row = 1; row<= n; row++){
            for(int col=1;col<=n;col++){
                System.out.print("x ");
            }//when one row is printed we need to add a new line.
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int row = 1; row<= n; row++){
            for(int col=1;col<=row;col++){
                System.out.print("x ");
            }//when one row is printed we need to add a new line.
            System.out.println();
        }
    }
}
