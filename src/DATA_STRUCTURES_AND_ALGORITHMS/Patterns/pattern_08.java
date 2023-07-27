package DATA_STRUCTURES_AND_ALGORITHMS.Patterns;

public class pattern_08 {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {
        int originalN = n;
        n = 2*n;
        for (int r = 1; r < n; r++) {
            for (int c = 1; c <n; c++) {
                int currentPos = originalN - Math.min(Math.min(r,c), Math.min(n-r,n-c));
                System.out.print(currentPos+" ");
            }
            System.out.println();
        }
    }
}
