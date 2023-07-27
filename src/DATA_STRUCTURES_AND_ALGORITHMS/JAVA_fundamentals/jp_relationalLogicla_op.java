package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_relationalLogicla_op {
    public static void main(String[] args) {
        System.out.println("For logical AND.");
        boolean A = true;
        boolean B = false;
        if(A && B){
            System.out.println("Y");
        }else{
            System.out.println("N");
            System.out.println("For logical OR");
            boolean C = true;
            boolean D = false;
            if(C || D){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
            System.out.println("For logical NOT.");
            boolean E = true;
            boolean F = false;
            System.out.print("NOT of E:");
            System.out.println(!E);
            System.out.print("NOT of F:");
            System.out.println(!F);
        }
    }
}
