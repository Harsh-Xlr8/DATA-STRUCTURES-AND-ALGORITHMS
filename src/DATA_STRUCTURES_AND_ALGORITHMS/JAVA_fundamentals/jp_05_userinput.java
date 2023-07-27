package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
 import java.util.Scanner;

public class jp_05_userinput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User.");
        Scanner sc =new Scanner(System.in);
       System.out.println("enter number one");
        int a = sc.nextInt();
        //float a = sc.nextFloat();
        System.out.println("enter number two");
        int b = sc.nextInt();
        //float b = sc.nextFloat();
        int sum= a+b;
        //float sum = a+b;
        System.out.println("Sum of given numbers is: " );
        System.out.println(sum);
       //boolean b1= sc.hasNextInt();
        //System.out.println(b1);
        //String str = sc.nextLine();
        //System.out.println(str);
    }
}
