package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
import java.util.Scanner;
public class jp_practiceset_condi_if_else {
    public static void main(String[] args) {
       /*question 1
        int a = 10;
        if(a==11){
            System.out.println("You are 11 years old.");
        }else{
            System.out.println("you are not 11.");
        }
        *///question 2
        /*  byte m1,m2,m3;
        System.out.println("Enter marks in english:");
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextByte();
        System.out.println("Enter marks in computer:");
        m2 = sc.nextByte();
        System.out.println("Enter marks in maths:");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Overall percentage is: " +avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congratulations you have been promoted.");
        }else{
            System.out.println("Sorry! you have not been promoted. Try next time!");
        }*/

      //Question 3
      /*  Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your income in lakhs:");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5f){
            tax = tax +0;
        }
        else if(income>2.5f && income<=5.0f){
            tax = tax + 0.05f*(income-2.5f);
        }
        else if (income>5.0f && income<=10.0f){
            tax = tax +0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(income-5.0f);
        }
        else if (income>10.0f){
            tax = tax +0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(10.0f-5.0f);
            tax = tax + 0.3f*(income-10.0f);
        }
        System.out.println("Total tax paid on your salary is:" +tax);
*/
        //question 4

       /* int var;
        Scanner st= new Scanner(System.in);
        System.out.println("Enter the number here:");
        var = st.nextInt();
        switch (var){
            case 1->{
                System.out.println("Monday");
            }  case 2->{
                System.out.println("Tuesay");
            }  case 3->{
                System.out.println("Wednesday");
            }  case 4->{
                System.out.println("Thursday");
            }  case 5->{
                System.out.println("Friday");
            }  case 6->{
                System.out.println("Saturday");
            }  case 7->
                System.out.println("Sunday");

        }*/

       Scanner sc = new Scanner(System.in);
       String website = sc.next();
       if(website.endsWith(".com")){
           System.out.println("Commercial website");
        }else if(website.endsWith(".org")){
           System.out.println("Organisational website");
        }else if(website.endsWith(".in")){
           System.out.println("Indian website");
        }

    }
}
