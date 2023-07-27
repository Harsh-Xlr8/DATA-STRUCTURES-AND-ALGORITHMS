package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

import java.util.ArrayList;

public class ReturnArraylist {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,4,3,3};
        int target = 3;
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr,target,0, list);
//        System.out.println(ans);
//        System.out.println(list);
        System.out.println(findAllIndex2(arr,target,0));
    }
//    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
//        if(arr[index] == target) list.add(index);
//        if(index == arr.length-1) return list;
//        return findAllIndex(arr,target,index+1,list);
//    }
    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(arr[index] == target) list.add(index);  // THIS WILL CONTAIN ANSWER FOR THAT FUNCTION CALL ONLY.
        if(index == arr.length-1) return list;
        ArrayList<Integer> answerFromBelowCalls =  findAllIndex2(arr,target,index+1);
        list.addAll(answerFromBelowCalls);
        return list;

    }
}
