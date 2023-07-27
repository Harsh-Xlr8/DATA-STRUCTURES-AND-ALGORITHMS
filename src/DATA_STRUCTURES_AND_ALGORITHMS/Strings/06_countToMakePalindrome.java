package DATA_STRUCTURES_AND_ALGORITHMS.Strings;

class countToMakePalindrome {
    public static int countP(String str) {
        int i = 0, j = str.length()-1;
        int count = 0;
        int last = j;
        while (i<j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                count++;
                i = 0;
                j = --last;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abaa";
        System.out.println(countP(str));
    }
}