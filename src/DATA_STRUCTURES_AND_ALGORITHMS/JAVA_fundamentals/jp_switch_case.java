package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_switch_case {
    public static void main(String[] args) {
      /*  int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("You are an adult now.");
                break;
            case 22:
                    System.out.println("You got your first job.");
                    break;
            case 60:
                        System.out.println("You are near to retirement from work.");
                        break;
            default:
                System.out.println("'Enjoy your life!");*/

        String var = "Harsh";
        switch (var){
           case "Harsh" ->{
               System.out.println("You are going to be very successful man.");
//               System.out.println("You are going to be very successful man.");
//               System.out.println("You are going to be very successful man.");
           } case "Saksham" ->{
                System.out.println("You will become MLA.");
            } case "Krishnam" ->{
                System.out.println("You will become a very successful lawyer.");
            } default ->{ System.out.println("Enjoy the life!");}
        }
    }
}
