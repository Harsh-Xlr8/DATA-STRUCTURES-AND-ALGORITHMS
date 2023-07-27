package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Maths;
import java.util.*;

public class printPrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        for(int i=s;i<=e;i++){
            int count=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                count++;
                break;
                }
            }
            if(count==0){
            System.out.println(i);
        }
        }
    }
}
