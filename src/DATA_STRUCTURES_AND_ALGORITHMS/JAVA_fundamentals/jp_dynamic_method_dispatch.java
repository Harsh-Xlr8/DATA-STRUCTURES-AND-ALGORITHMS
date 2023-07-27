package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
class Phone{
    public void showtime(){
        System.out.println("Time is 4pm");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing music.");
    }
    public void on(){
        System.out.println("Turning on smart phone");
    }
}
public class jp_dynamic_method_dispatch {
    public static void main(String[] args) {
//Phone obj= new Phone();
//Smartphone smobj  = new Smartphone();
//        obj.name();
        Phone obj = new Smartphone(); //ALLOWED
      //  Smartphone obj = new Phone();  >>NOT ALLOWED
        obj.showtime();
        obj.on();

    }
}
