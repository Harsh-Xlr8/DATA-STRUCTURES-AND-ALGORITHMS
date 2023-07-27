package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
import java.util.Scanner;
public class jp_if_else_statements {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int a = 18;
        if(age>=18){
        System.out.println("You are eligible to vote");}
        else{
            System.out.println("NOT eligible");
        }
    }
}
