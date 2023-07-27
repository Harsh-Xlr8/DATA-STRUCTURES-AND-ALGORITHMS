package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

public class ConstructorsAndThis {
    public static class person{
        int age;
        String name;
        void SayHi(){
            System.out.println(name +"["+age+"] says hi!");
        }
        person(){

        }
        person(int a,String b){
            this.age = a;
            this.name = b;
        }
    }

    public static void main(String[] args) {
    person p1 = new person();
    p1.age = 10;
    p1.name = "Amaya";
    p1.SayHi();
    person p2 = new person(19,"Aditi");
    p2.SayHi();

    }
}
