package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

class base1{
    base1(){
        System.out.println("I am a constructor.");
    }base1(int x){
        System.out.println("I am an overloaded constructor with value of x: "+x);
    }
}
class Derived1 extends base1{
    Derived1(){
        //super(4);
        System.out.println("I am derived class constructor.");
    }Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded derived constructor with value of y: "+y);

    }
}class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor.");
    } ChildOfDerived(int x,int y,int z){
        super(x, y);
        System.out.println("I am an overloaded derived constructor with value of z: "+z);
    }

}
public class jp_constructors_inheritance {
    public static void main(String[] args) {
       // base1 b = new base1();
//Derived1 d = new Derived1(8,5);
ChildOfDerived c= new ChildOfDerived(1,2,3);

    }
}
