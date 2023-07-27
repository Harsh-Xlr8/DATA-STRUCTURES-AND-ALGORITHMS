package DATA_STRUCTURES_AND_ALGORITHMS.Strings;
class Strings_In_Java {
    public static void main(String[] args) {
        String str = "geeks";
        String s1 = "Geeks";
        String s2 = "Geeks";
        if (s1==s2) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        String s3 = new String("Geeks");
        if (s1==s3) {
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));

    }
}
