package DATA_STRUCTURES_AND_ALGORITHMS.Strings;
class Check_Subsequence {
    public static boolean check(String s1,String s2,int m,int n){

        if(n==0) return true;
        if(m==0) return false;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return check(s1,s2,m-1,n-1);               //RECURSIVE SOLUTION
        }else{
           return check(s1,s2,m,n-1);
        }


//        int j=0;
//        for(int i=0;i<m&&j<n;i++){
//            if(s1.charAt(i)==s2.charAt(j)){           ITERATIVE SOLUTION
//                j++;
//            }
//        }return j==n;
    }

    public static void main(String[] args) {
        String s1 = "A,B,C,D,E,F";
        String s2 = "A,D,F";
        int m = s1.length();
        int n = s2.length();
        System.out.println(check(s1,s2,m,n));
    }
}
