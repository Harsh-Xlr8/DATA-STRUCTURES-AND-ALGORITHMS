package DATA_STRUCTURES_AND_ALGORITHMS.Strings;

 class Pattern_Searching {
static void patsearch(String txt,String pat){
int n = txt.length();
int m = pat.length();
for(int i=0;i<=n-m;i++){
 int j;
 for(j=0;j<m;j++){
  if(pat.charAt(j)!=txt.charAt(i+j)){
   break;
  }
 }if(j==m)
  System.out.print(i+" ");
}
}

  public static void main(String[] args) {
   String txt = "ABCDLKJDLJ";
   String pat = "DL";
   patsearch(txt,pat);
  }
}
