package DATA_STRUCTURES_AND_ALGORITHMS.Patterns;

public class pattern_06 {
    public static void main(String[] args) {
        pattern6(6);
    }
    static void pattern6(int n){
        for(int r=1;r<=n;r++){
            for(int space=0;space<n-r;space++){
                System.out.print("  ");
            }
            for(int c=r;c>=1;c--){
                System.out.print(c+" ");
            } for(int c=2;c<=r;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
