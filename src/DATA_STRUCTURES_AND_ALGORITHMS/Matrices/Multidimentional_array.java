package DATA_STRUCTURES_AND_ALGORITHMS.Matrices;

public class Multidimentional_array {
    public static void main(String[] args) {
        int m=2,n=3;
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = 10;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
