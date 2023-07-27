package DATA_STRUCTURES_AND_ALGORITHMS.Strings;

import java.util.Arrays;

class leftMost_NonRepChar {
    static final int CHAR = 256;
    static int nonRep(String str){
//       int res=-1;
//       int n = str.length();
//       for(int i=0;i<n;i++){
//           boolean flag = false;
//           for(int j=0;j<n;j++)
//               if(i!=j && str.charAt(i)==str.charAt(j)){        BRUTE FORCE
//                   flag = true;
//                   break;
//               }if(!flag){
//                   return i;
//               }
//           }
//       return res;


//        int[] count = new int[CHAR];
//        for(int i=0;i<str.length();i++){
//            count[str.charAt(i)]++;                 BETTER SOLUTION(two traversal)
//        }
//        for(int i=0;i<str.length();i++){
//            if(count[str.charAt(i)]==1)
//                return i;
//        }
//        return -1;

int[] fI = new int[CHAR];
Arrays.fill(fI,-1);
for(int i=0;i<str.length();i++){
    if(fI[str.charAt(i)]==-1)
        fI[str.charAt(i)]=i;
    else
        fI[str.charAt(i)]=-2;
}
int res = Integer.MAX_VALUE;
for(int i=0;i<CHAR;i++){
    if(fI[i]>=0)
        res = Math.min(res,fI[i]);

}
        return res;
    }

    public static void main(String[] args) {
       String str = "abdbfgsad";
        System.out.println(nonRep(str));
    }
}
