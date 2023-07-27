package DATA_STRUCTURES_AND_ALGORITHMS.Strings;


class Palindrome_Check {
    public static boolean isPal(String str){
        int begin = 0;
        int end = str.length()-1;
        while(begin<end){                                //  OPTIMIZED
            if(str.charAt(begin)!=str.charAt(end))
                return false;
            begin++;  end--;
        }return true;
//        StringBuilder rev = new StringBuilder(str);
//        rev.reverse();                                   BRUTE FORCE
//        return str.equals(rev.toString());
    }

    public static void main(String[] args) {
        String str = "ABCCBA";
        System.out.println(isPal(str));
    }
}
