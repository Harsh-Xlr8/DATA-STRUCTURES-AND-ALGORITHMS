package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

public class Arrays_01_BarChart {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,7};
        int n = 5;
        barChart(arr,n);
    }
    static void barChart(int[] arr,int n){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>=max)  max = arr[i];
        }
        for(int floor = max;floor>=1;floor--){
            for(int b=0;b<n;b++){
                if(arr[b] >= floor){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
