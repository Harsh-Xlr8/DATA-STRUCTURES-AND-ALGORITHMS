package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;


class Solution {
    public static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp  = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{i++;}
        }for(int index = 0;index<arr.length;index++){
            if(arr[index]!=index)
                return index;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int [] arr = {1,0,3,5,4};
        System.out.println(missingNumber(arr));
    }
}

