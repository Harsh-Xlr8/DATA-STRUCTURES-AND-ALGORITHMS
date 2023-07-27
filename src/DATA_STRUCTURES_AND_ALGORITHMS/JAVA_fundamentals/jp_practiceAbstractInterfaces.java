package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    void write(){
        System.out.println("write");
    }void refill(){
        System.out.println("refill");
    }void changeNib(){
        System.out.println("change the nib");
    }
}class monkey{
    void jump(){
        System.out.println("jumps");
    }void bite(){
        System.out.println("bites");
    }
    }
    interface basicAnimal{
    void eat();
    void sleep();
}class Humans extends monkey implements basicAnimal{
    void speak(){
        System.out.println("hello sir");
    }public void eat(){
        System.out.println("eating");
    }public void sleep(){
        System.out.println("sleeping");
    }
}
abstract class telephone{
    void ring(){
        System.out.println("ringing");
    }void lift(){
        System.out.println("lifting");
    }void disconnect(){
        System.out.println("disconnecting");
    }
}class SmartPhone extends telephone{
    void camera(){
        System.out.println("take pictures");
    }void mediaPlayer(){
        System.out.println("play music");
    }void game(){
        System.out.println("play games");
    }
}
public class jp_practiceAbstractInterfaces {
    public static void main(String[] args) {
fountainPen fp = new fountainPen();
fp.changeNib();
Humans harsh = new Humans();
harsh.eat();
harsh.speak();
harsh.sleep();
telephone t = new SmartPhone();
t.disconnect();
t.ring();
    }
}
