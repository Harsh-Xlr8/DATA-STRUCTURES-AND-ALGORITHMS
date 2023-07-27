package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
abstract class parent{
    public parent(){
        System.out.println("i am the constructor of class parent");
    }public void sayHello(){
        System.out.println("hello!");
    }abstract public void greet();
    abstract public void greet2();
}class child extends parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good evening");
    }
}abstract class child2 extends parent{
    public void th(){
        System.out.println("hello!");
    }
        }
public class jp_abstract {
    public static void main(String[] args) {
child c = new child();
//parent p = new parent();--- Shows error
        //child2 ch = new child2();---Shows error
    }
}
