package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,6,7,7};
        int target = 7;
        System.out.println(linearSearch(arr,target));
    }
    static List<Integer>  linearSearch(int[] arr,int target){
        return helper(arr,target,0);
    }
    public static ArrayList<Integer> list = new ArrayList<>();
    static List<Integer> helper(int[] arr, int target, int index){
        if(arr[index]==target) list.add(index);
        if(index==arr.length-1) return list;
        return helper(arr,target,index+1);


    }
}
