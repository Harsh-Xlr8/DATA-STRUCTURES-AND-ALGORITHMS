package DATA_STRUCTURES_AND_ALGORITHMS.Strings;

public class Performance {
    public static void main(String[] args) {

        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
          String series = "";
//            System.out.println(ch);
            series= series+ch;
            System.out.print(series+" ");
        }
    }
}
