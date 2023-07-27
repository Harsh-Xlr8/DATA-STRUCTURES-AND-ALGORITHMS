package DATA_STRUCTURES_AND_ALGORITHMS.Matrices;


public class TransposeMatrix {
        static int n = 4;

        static void transpose(int[][] mat)
        {
            int[][] temp = new int[n][n];

            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    temp[i][j] = mat[j][i];

            for(int i = 0; i < n; i++)
                System.arraycopy(temp[i],0,mat[i],0,n);

        }

    public static void main(String[] args) {
        int[][] mat= new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        transpose(mat);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
