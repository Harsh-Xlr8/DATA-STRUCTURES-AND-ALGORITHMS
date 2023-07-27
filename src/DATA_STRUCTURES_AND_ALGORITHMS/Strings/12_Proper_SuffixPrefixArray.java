package DATA_STRUCTURES_AND_ALGORITHMS.Strings;

class Proper_SuffixPrefixArray {
    static int longPreSuffixArr(String str, int n){
        for(int len=n-1;len>0;len--){
            boolean flag=true;
            for(int i=0;i<len;i++)
                if (str.charAt(i) != str.charAt(n - len + i)) {
                    flag = false;
                    break;
                }
            if(flag)
                return len;
        }
        return 0;
    }
    static void fillLPS(String s,int[] lps){
        for(int i=0;i<s.length();i++){
            lps[i] = longPreSuffixArr(s,i+1);
            System.out.print(lps[i]+" ");
        }
    }
    public static void main(String[] args) {
        String txt = "abacabad";int[] lps=new int[txt.length()];
        fillLPS(txt,lps);
    }
}
