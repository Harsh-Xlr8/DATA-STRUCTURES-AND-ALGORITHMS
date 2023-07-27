package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;
import java.util.*;
import java.util.HashMap;

class FrequencyOfArrayElements {
    static void countFreq(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x:arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
           for(Map.Entry<Integer,Integer> e: h.entrySet())
               System.out.println(e.getKey()+" "+e.getValue());
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,3};
        countFreq(arr);
    }
}

/*static void printFreq(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        boolean flag = false;
        for (int j = 0; j < i; j++)
            if (arr[i] == arr[j]) {
                flag = true;
                break;
            }                                         //NAIVE SOLUTION
        if (flag)
            continue;
        int freq = 1;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j])
                freq++;

        }
        System.out.println("Frequency Of "+arr[i]+" is "+freq);
    }
}
public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,3};
        printFreq(arr);
    }
}
}*/
