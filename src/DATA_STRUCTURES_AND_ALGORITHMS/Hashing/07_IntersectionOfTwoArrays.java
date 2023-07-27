package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;
import java.util.*;
class IntersectionOfTwoArrays {
    static int intersect(int[] a,int[] b){
       HashSet<Integer> s = new HashSet<>();
           for(int i:a)
           s.add(a[i]);
           int res=0;
           for(int j:b){
           if(s.contains(b[j]))  res++;     s.remove(b[j]);}
           return res; }
    public static void main(String[] args) {
        int[] a = {1,2,3,3,4,5};
        int[] b = {9,2,3,3,7,8};
        System.out.println(intersect(a,b));
    }
}
