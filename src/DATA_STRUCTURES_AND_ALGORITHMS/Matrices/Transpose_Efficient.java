package DATA_STRUCTURES_AND_ALGORITHMS.Matrices;

public class Transpose_Efficient {
static void swap(int[][]mat,int i,int j){
    int temp = mat[i][j];
    mat[i][j] = mat[j][i];
    mat[j][i] = temp;
}
static void transpose(int[][] mat){
    int n = mat.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            swap(mat,i,j);
        }
    }
}
    public static void main(String[] args) {
        int[][] mat= new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        transpose(mat);
        int n = mat.length;
        for (int[] ints : mat) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}
