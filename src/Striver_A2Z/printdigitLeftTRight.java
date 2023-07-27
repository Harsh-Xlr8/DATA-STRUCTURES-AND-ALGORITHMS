package Striver_A2Z;

public class printdigitLeftTRight {
    public static void main(String[] args) {
        printD(9875628);
    }
    static void printD(int n){
        int count=0;
        int N = n;
        while(N!=0){
            N = N/10;
            count++;
        }
        int dev = (int)Math.pow(10,count-1);
        while(n!=0){
            int q = n/dev;
            System.out.println(q);
            n = n%dev;
            dev = dev/10;
        }
    }
}
