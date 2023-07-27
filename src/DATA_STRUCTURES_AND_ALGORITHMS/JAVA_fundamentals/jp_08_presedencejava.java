package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_08_presedencejava {
    public static void main(String[] args) {
        //PRECEDENCE AND ASSOCIATIVITY
        int a = 65/5 + 2*7;//  precedence of * and / is more than + or - .
        //   =13+2*7
        //   =13+14
        //   =27
        int b = 20*5 + 32/4;// associativity among * and / is left to right
        //   100+32/4
        //   100+8
        //   108
        System.out.println(a);
        System.out.println(b);

        //quick quiz

    }
}
