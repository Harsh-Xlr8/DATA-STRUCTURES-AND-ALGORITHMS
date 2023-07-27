package DATA_STRUCTURES_AND_ALGORITHMS.Patterns;

public class pattern_07 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n){
        for(int r=1;r<=2*n;r++){
            int c = r>n ? 2*n-r : r;
            for(int space=0;space<=n-c;space++){
                System.out.print("  ");
            }
            for(int col = c;col>=1;col--){
                System.out.print(col+" ");
            }for(int col = 2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
