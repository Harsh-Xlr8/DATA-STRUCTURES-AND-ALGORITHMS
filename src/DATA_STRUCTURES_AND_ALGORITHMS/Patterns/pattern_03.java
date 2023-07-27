package DATA_STRUCTURES_AND_ALGORITHMS.Patterns;

public class pattern_03 {
    public static void main(String[] args) {
        pattern4(6);
    }
    static void pattern4(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
