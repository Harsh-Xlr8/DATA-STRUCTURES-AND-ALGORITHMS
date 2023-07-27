package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
import java.util.Scanner;
public class jp_else_if_statements {
    public static void main(String[] args) {
        System.out.println("Please enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced.");
        }
        else if(age>46){
            System.out.println("You are semi-experienced.");
        }else if(age>36){
            System.out.println("You are semi-semi-experienced.");
        }else{
            System.out.println("NOT experienced.");
        }
    }
}
