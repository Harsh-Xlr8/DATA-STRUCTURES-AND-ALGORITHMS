package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
class employee{
    int id;
    String name;
    float salary;
    public void printDetails(){
        System.out.println("employee id is:" +id);
        System.out.println("employee name is:" +name);
    }

    public float getSalary() {
        return salary;
    }
}
public class jp_OOPs_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        employee harsh = new employee();   //instantiating a new employee object
        employee aniket = new employee();   //instantiating a new employee object

        //Setting properties
        harsh.id = 2889;
        harsh.name = "software developer 2";
        harsh.salary = 24;

        aniket.id = 2089;
        aniket.name = "software developer 1";
        aniket.salary = 18;

        //printing the attributes
//        System.out.println(harsh.id);
//        System.out.println(harsh.name);
        harsh.printDetails();
        aniket.printDetails();
        float salary = aniket.getSalary();
        System.out.println(salary);
    }
}
