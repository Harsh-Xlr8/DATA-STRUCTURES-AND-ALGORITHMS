package DATA_STRUCTURES_AND_ALGORITHMS.Recursion;

// REMOVE ALL THE A's FROM THE GIVEN STRING.
public class String_Skipchar {
    public static void main(String[] args) {
        skip("","bcaacda");
        System.out.println();
        System.out.print(skipR("bcaacda"));
    }
static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.print(p);
            return;}

        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
}
    static String skipR(String up){
        if(up.isEmpty()) return"";
        char ch = up.charAt(0);
        if(ch=='a'){
            return skipR(up.substring(1));
        }else{
            return ch+skipR(up.substring(1));
        }
}
}
