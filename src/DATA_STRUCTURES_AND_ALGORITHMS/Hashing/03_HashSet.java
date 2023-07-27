package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;
import java.util.*;
 class Hash_Set {
  public static void main(String[] args) {
   HashSet<String> h = new HashSet<>();
   h.add("Harsh");
   h.add("Ram");
   h.add("Himanshu");
   System.out.println(h);
   System.out.println(h.contains("Harsh"));
   for(String value:h){
    System.out.println(value+" ");
   }
   System.out.println(h.size());
   h.remove("Himanshu");
   System.out.println(h.size());
   System.out.println(h.isEmpty());
  }
}
