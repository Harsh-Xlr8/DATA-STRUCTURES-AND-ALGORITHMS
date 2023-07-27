package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class PythagorousTriplets {
    public static void main(String[] args) {
        System.out.println(triplets(5,4,3));
    }
    static boolean triplets(int a,int b,int c){
        int max = a;
        if(b>=max){
            max = b;
        }if(c>=max){
            max = c;
        }
        if(max == a){
            return Math.pow(a,2) == (Math.pow(b,2)+Math.pow(c,2));
        }if(max == b){
            return Math.pow(b,2) == (Math.pow(a,2)+Math.pow(c,2));
        }
        return Math.pow(c, 2) == (Math.pow(b, 2) + Math.pow(a, 2));
    }
}
