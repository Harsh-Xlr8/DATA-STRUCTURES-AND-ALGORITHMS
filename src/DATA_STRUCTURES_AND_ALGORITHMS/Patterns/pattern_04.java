package DATA_STRUCTURES_AND_ALGORITHMS.Patterns;

public class pattern_04 {
static void pattern(int n){
    for(int r=0;r<2*n;r++){
        int count = r>n ? 2*n-r : r;
        for(int c=0;c<count;c++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        pattern(9);
    }
}
