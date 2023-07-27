package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
class Employee1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}class cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }public void vibrate(){
        System.out.println("Vibrating....");
    }public void callFriend(){
        System.out.println("Calling Golu....");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
        }
        public int perimeter(){
            return 4*side;
    }
}class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }public int perimeter(){
        return 2*(length+breadth);
    }
}
class TomyVercity{
    public void run(){
        System.out.println("Runnning from the police!");
    }
    public void hit(){
        System.out.println("Hitting thee enemy!");
} public void eat(){
        System.out.println("Eating pizza!");}}
public class py_basicOOPs_practice {
    public static void main(String[] args) {
       /* Employee1 harsh = new Employee1();
        harsh.setName("harry");
        harsh.salary = 24;
        System.out.println(harsh.getSalary());
        System.out.println(harsh.getName());

        cellphone apple = new cellphone();
        apple.callFriend();
        apple.vibrate();
        apple.ring(); */

//           square sq = new square();
//           sq.side = 5;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

//         rectangle rec = new rectangle();
//         rec.length = 4;
//         rec.breadth = 6;
//        System.out.println(rec.area());
//        System.out.println(rec.perimeter());

        TomyVercity tomy = new TomyVercity();
        tomy.eat();
        tomy.hit();
        tomy.run();

        }
    }


