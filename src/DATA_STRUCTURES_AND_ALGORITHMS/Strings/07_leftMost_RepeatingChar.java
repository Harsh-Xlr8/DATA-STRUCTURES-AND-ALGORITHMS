package DATA_STRUCTURES_AND_ALGORITHMS.Strings;

class leftMost_RepeatingChar {
    static final int CHAR = 256;

    public static int leftRep(String str) {


        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }                                                 // BETTER APPROACH
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 1)
                return i;
        }
        return -1;
    }

//        for(int i=0;i<str.length();i++){
//            for(int j=i+1;j<str.length();j++){
//                if(str.charAt(i)==str.charAt(j)){           //  BRUTE FORCE
//                    return i;
//                 }
//            }
//        }return -1;
//    }

    public static void main(String[] args) {
        String str = "abcdd";
        System.out.println(leftRep(str));
    }
}