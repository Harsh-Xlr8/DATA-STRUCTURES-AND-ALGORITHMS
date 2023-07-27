package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
class oneClass{
    int a;
    public int getA(){
        return a;
    }
    oneClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}class twoClass extends oneClass{
    twoClass(int c){
        super(c);
        System.out.println("I am a constructor having value: " +c);
    }
}
public class jp_this_super {
    public static void main(String[] args) {
//      oneClass o = new oneClass(5);
//        System.out.println(o.getA());
        twoClass j = new twoClass(7);
    }
}
