package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;

import java.util.Map;

class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String,Integer> m = new java.util.HashMap<>();
        m.put("Harsh",32);
        m.put("Ram",10);
        m.put("Himanshu",34);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String, Integer>M : m.entrySet())
            System.out.println(M.getKey() + " " + M.getValue());
        if(m.containsKey("Harsh")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        m.remove("Ram");
        System.out.println(m.size());
        if(m.containsValue(32)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println(m.get("Harsh"));
        System.out.println(m.get("Ram"));
    }
}
