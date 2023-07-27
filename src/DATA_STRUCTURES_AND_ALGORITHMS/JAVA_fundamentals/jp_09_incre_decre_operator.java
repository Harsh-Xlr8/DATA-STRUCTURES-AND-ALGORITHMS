package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_09_incre_decre_operator {
    public static void main(String[] args) {
        int i = 34;
        int a = i++;//   first j is assigned i then i is incremented
        int j = 23;
        int b = ++j;//   first j is incremented then b is assigned j
        System.out.println(a);
        System.out.println(b);
        System.out.println(j);
        int y =7;
        System.out.println(++y*8);
        char ch = 'a';
        System.out.println(++ch);


    }
}
