package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;


import java.util.HashMap;
import java.util.Map;

class morethan_n_by_k_occurence {
    static void result(int[] a, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int n= a.length;
        for(int x:a)
            m.put(x, m.getOrDefault(x,0)+1);
            for(Map.Entry<Integer,Integer> y:m.entrySet()){
                if(y.getValue()>n/k)
                    System.out.println(y.getKey());
            }



//    int n = a.length;
//    Arrays.sort(a);
//       int i=1,count=1;
//        while(i<n) {
//            while (i < n && (a[i]==a[i - 1])){             NAIVE SOLUTION
//               count++;
//               i++;
//            }
//            if (count>(n/k))
//                System.out.print(a[i-1]+" ");
//                count = 1;
//                i++;}
        }
        public static void main (String[]args){
            int[] arr = new int[]{10, 10, 20, 30, 20, 10, 10};
            int k = 2;
            result(arr, k);
        }
    }