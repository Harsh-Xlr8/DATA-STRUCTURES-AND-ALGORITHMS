package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am the constructor!");
    }
}
class Derived extends base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class jp_Inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(2);
        System.out.println(b.getX());
        //creating an object of derived class
        Derived d = new Derived();
        d.setY(4);
        System.out.println(d.getY());
    }
        }
