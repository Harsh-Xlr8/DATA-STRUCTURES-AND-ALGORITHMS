package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_practice_methods {
 //Multiplication table of a number n.
    static void multiplication(int n){
        for(int i=0;i<=10;i++){
            System.out.format("%d x %d = %d \n",n,i,n*i);
        }
    }

    public static void main(String[] args) {
        multiplication(9);

    }
}
