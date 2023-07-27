package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;

import java.util.HashSet;
import java.util.Set;

class countDistinctElement {
    /*static int countDistinct(int[] arr, int n)
    {
        int res = 1;
        // Pick all elements one by one
        for (int i = 1; i < n; i++) {
          int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])         //--NAIVE METHOD--
                    break;
            // If not printed earlier,
            // then print it
            if (i == j)
                res++;}
        return res;
    }*/
    static int countDistinct(int[] arr){
        Set<Integer> h = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }return h.size();
    }
    public static void main(String[] args)
    {
        int[] arr = { 12, 10, 9, 45, 2, 10, 10, 45 };
        System.out.println(countDistinct(arr));
    }
}

