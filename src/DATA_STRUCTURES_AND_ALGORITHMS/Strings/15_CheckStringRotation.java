package DATA_STRUCTURES_AND_ALGORITHMS.Strings;


class CheckStringRotation {
    static boolean check(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }else{
            return ((s1 + s1).contains(s2));
        }
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";
        System.out.println(check(s1,s2));
    }
}
