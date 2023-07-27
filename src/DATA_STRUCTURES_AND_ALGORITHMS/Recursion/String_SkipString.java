package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

public class String_SkipString {
    public static void main(String[] args) {
       // System.out.println(SkipSting("bdapplegr"));
        System.out.println(SkipAppSting("bdapplegr"));
    }
    static String SkipSting(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return SkipSting(up.substring(5));
        }else{
            return up.charAt(0)+SkipSting(up.substring(1));
        }
    } static String SkipAppSting(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return SkipAppSting(up.substring(3));
        }else{
            return up.charAt(0)+SkipAppSting(up.substring(1));
        }
    }
}
