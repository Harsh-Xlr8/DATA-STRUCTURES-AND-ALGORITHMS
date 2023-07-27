package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int x=0;
        System.out.println("The valur of factorial is: "+ factorial(x));
    }
}
