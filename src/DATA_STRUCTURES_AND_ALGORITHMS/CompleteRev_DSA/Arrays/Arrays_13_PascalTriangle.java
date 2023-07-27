package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Arrays;

import java.util.ArrayList;

public class Arrays_13_PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(pascalTriangle(n));
    }
    static ArrayList<Integer> pascalRow(int n){
        int res=1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1;i<n;i++){
            res = res*(n-i);
            res = res/i;
            list.add(res);
        }return list;
    }
    static ArrayList<ArrayList<Integer>> pascalTriangle(int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ArrayList<Integer> temp = pascalRow(i);
            ans.add(temp);
        }
        return ans;
    }
}
