package DATA_STRUCTURES_AND_ALGORITHMS.Strings;



class reverse_String {
static void revString(char[] str){
    int start=0;
    for(int end=0;end<str.length;end++) {
        if (str[end] == ' ') {
            reverse(str, start, end - 1);
            start = end + 1;
        }
    }
            reverse(str,start,str.length-1);
            reverse(str,0,str.length-1);
    }

static void reverse(char[] s,int low,int high){
    while(low<=high) {
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        low++;high--;
    }
}
    public static void main(String[] args) {
    String s = "welcome to home";
    char[] str = s.toCharArray();
    revString(str);
        System.out.println(str);
    }
}
