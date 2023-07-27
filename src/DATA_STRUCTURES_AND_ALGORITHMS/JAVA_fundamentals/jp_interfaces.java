package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
interface bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements bicycle{
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    @Override
    public void applyBrake(int decrement) {
        System.out.println("apply brakes");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("paddle fast to speed up.");
    }
}
public class jp_interfaces {
    public static void main(String[] args) {
        AvonCycle Cycle = new AvonCycle();
        Cycle.applyBrake(1);
        System.out.println(Cycle.a);
    }
}
