package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_practice_arrays {
    public static void main(String[] args) {
//        1)Create an array of five foats and calculate their sum
//        float[] marks= {21.2f,3,4,2,23.5f};
//        float sum = 0;
//        for(float elements:marks){
//            sum = sum+elements;
//        }
//        System.out.println("sum of all marks is:");
//        System.out.println(sum);
//        2)Write a program to find out whether a integer is present in an array or not.
//        float[] marks= {21.2f,3,4,2,23.5f};
//        float num = 7f;
//        for(float elements:marks){
//            if(elements==num){
//                System.out.println("yes");
//        }else {
//                System.out.println("The value is not present.");
//    }break;
//        }

//       3)Calculate average marks of students using for loop.
//        float[] marks = {31.2f, 39, 40, 23.5f};
//        float average = 0;
//        for (float elements : marks) {
//            average = (average + elements);
//        }
//        System.out.println("average of all marks is:" + average / marks.length);

//     4) Create a java program to add 2 matrix of size 2x3;
//
//        int[][] mat1 = {{2, 3, 4},
//                {5, 6, 7}};
//        int[][] mat2 = {{2, 3, 4},
//                {5, 6, 7}};
//        int[][] result = {{0, 0, 0},
//                {0, 0, 0}};
//        for (int i = 0; i < mat1.length; i++) { // row number of times.
//            for (int j = 0; j < mat1[i].length; j++) { //column number of times.
//                System.out.format("Setting value for i=%d and j=%d\n",i,j);
//                result[i][j]= mat1[i][j]+mat2[i][j];
//            }
//        }for (int i = 0; i < mat1.length; i++) { // row number of times.
//                    for (int j = 0; j < mat1[i].length; j++) { //column number of times.
//                        System.out.print(result[i][j] +" ");
//                        result[i][j] = mat1[i][j] + mat2[i][j];
//
//    }
//            System.out.println("");
//        }


//        Write  a java program to reverse an array.
        int[]arr= {1,2,3,4,5,6};
        int l= arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            temp= arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1]= temp;
        }for(int element:arr){
            System.out.print(element+ " ");
        }


}
}