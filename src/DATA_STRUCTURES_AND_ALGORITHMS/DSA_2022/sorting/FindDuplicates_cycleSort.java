package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

public class FindDuplicates_cycleSort {
    public static int duplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!= i+1){
                int correct = arr[i]-1;
                if(arr[i]!= arr[correct]){
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }else{return arr[i];}
            }else{i++;}
        }return -1;
    }

    public static void main(String[] args) {
            int[] arr = {1,2,5,3,3,4};
            System.out.print(duplicate(arr));
    }
}
