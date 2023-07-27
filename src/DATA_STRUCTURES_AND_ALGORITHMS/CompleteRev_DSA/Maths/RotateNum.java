package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;

public class RotateNum {
    public static void main(String[] args) {
        rotate(12345,2);
    }
    static void rotate(int n,int k){
        int count=0;
        int temp = n;
        while(temp!=0){
            temp/=10;
            count++;
        }
        int div = (int)Math.pow(10,k);
        int multi = (int)Math.pow(10,count-k);
        int rotatedNum = n%div*multi+n/div;
        System.out.println(rotatedNum);
    }
}
