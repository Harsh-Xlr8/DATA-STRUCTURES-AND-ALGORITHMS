package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_practice_breakconti {
    public static void main(String[] args) {
        // 1) Write the program to print following pattern.
//       int na=4;
//       for(int i=a;i>0;i--){
//           for(int j =0;j<i;j++){
//               System.out.print("*");
//           }
//           System.out.println("\n");
//       }
       // 2) Write a program to sum first n even numbers using while loop.
//        int sum=0;
//       int n=4;
//       for(int i=0;i<=4;i++){
//           sum = sum+ (2*i);
//       }
//        System.out.println("The sum of first n n=even numbers is: ");
//        System.out.println(sum);

//      int n=10;
//      for(int i=10;i>=1;i--){
//          System.out.printf("%d X %d = %d\n",n,i,n*i);
//      }

        // Write a program to write factorial of a given number.
//
//        int n = 5;
//        int i = 1;
//        int factorial = 1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.printf("The value of factorial is %d",factorial );

// What can be done using one type of loop can also be done using other two types of loop.---> TRUE


      int n=8;
      int sum = 0;
      for(int i=1;i<=10;i++){
          sum += n*i;

      }
        System.out.println(sum);
    }
}