package DATA_STRUCTURES_AND_ALGORITHMS.Strings;

class Check_For_Anagram {
    static final int CHAR = 256;
    static boolean isAnagram(char[] str1,char[] str2){
        int[] count = new int[CHAR];
        int i;

        // If both strings are of different
        // length. Removing this condition
        // will make the program fail for
        // strings like "aaca" and "aca"
        if (str1.length != str2.length)             //OPTIMIZED
            return false;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for(i = 0; i < str1.length; i++)
        {
            count[str1[i]]++;
            count[str2[i]]--;
        }

        // See if there is any non-zero
        // value in count array
        for(i = 0; i < CHAR; i++)
            if (count[i] != 0)
            {
                return false;
            }
        return true;
//        if(s1.length()!=s2.length())  return false;
//        char[] a1 = s1.toCharArray();
//        Arrays.sort(a1);
//        char[] a2 = s2.toCharArray();               //NAIVE SOLUTION
//        Arrays.sort(a2);
//        return a1.equals(a2);
    }  public static void main(String[] args) {
        char[] str1 = "abaac".toCharArray();
        char[] str2 = "aacba".toCharArray();
        System.out.println(isAnagram(str1, str2));
    }
}
