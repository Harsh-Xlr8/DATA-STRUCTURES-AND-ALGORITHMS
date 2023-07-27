package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_multidimentional_array {
    public static void main(String[] args) {
    //    int []marks;     //1-D array
        int[][] flats;   //2-D array
        flats = new int[2][3];
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=200;
        flats[1][1]=201;
        flats[1][2]=202;
        System.out.println("Multidimentional 2D array");
        for(int i=0;i<flats.length;i++){
        for(int j=0;j<flats.length;j++){
            System.out.println(flats[i][j]);
            System.out.println(" ");
        }
            System.out.println("\n");
    }
}}
