package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
class C1{
    public int x = 5;
    protected int y = 34;
    int z= 12;
    private int k = 67;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
    }
}
public class jp_accessmodifiers {
    public static void main(String[] args) {
        C1 c = new C1();
       // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.k);
}
}
