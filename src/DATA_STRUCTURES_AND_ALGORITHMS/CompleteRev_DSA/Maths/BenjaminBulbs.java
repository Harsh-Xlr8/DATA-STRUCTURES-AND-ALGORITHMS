package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class BenjaminBulbs {
    public static void main(String[] args) {
     Bulbs(30);
    }
    static void Bulbs(int n){
        // Here the trick is all perfect squares will have odd no. of factors that's why the bulb will be left open.
        for(int i=1;i*i<=n;i++){
            System.out.print(i*i+" ");
        }
    }
}
