package DATA_STRUCTURES_AND_ALGORITHMS.Matrices;

public class BoundryElements_matrices {
    static void bTraversal(int[][] mat){
        int r=4,c=4;
        if(r==1){
            for(int i=0;i<c;i++){
                System.out.print(mat[0][i]);
            }
        }else if(c==1){
            for(int i=0;i<r;i++){
                System.out.print(mat[i][0]);
            }
        }else{                                       //TO BE DUE
            for(int i=0;i<r;i++){
                System.out.println(mat[0][i]);
            }
            for(int i=1;i<c-1;i++){
                System.out.println();
            }
        }
    }
}
