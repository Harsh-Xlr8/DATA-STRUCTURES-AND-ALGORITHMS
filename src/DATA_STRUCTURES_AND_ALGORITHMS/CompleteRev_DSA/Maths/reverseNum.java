package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class reverseNum {
    public static void main(String[] args) {
        rev(12345);
    }
    static void rev(int n){
       while(n>0){
        int q = n%10;
        System.out.print(q+" ");
        n = n/10;}
    }
}
