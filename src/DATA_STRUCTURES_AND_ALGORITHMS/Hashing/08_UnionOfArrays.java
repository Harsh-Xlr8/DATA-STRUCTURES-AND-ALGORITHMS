package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;

import java.util.HashSet;

class UnionOfArrays {
    static int union(int[] a,int[] b){

        HashSet<Integer> s = new HashSet<>();
        for (int i : a) s.add(i);
        for (int j : b) s.add(j);
        return s.size();

    }  public static void main(String[] args) {
        int[] a = {1,2,3,3,4,5};
        int[] b = {9,2,3,3,};

        System.out.print(union(a,b));
    }
}
