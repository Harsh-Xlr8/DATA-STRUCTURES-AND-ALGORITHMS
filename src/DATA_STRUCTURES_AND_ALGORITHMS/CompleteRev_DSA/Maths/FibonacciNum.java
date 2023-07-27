package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class FibonacciNum {
    public static void main(String[] args) {
    fibonacci(9);
    }
    static void fibonacci(int n){
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
