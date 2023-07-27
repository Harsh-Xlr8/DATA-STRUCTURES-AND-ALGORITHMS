package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_break_continue {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            System.out.println("I will learn java by the end of this month.");
//            if (i == 2) {
//                System.out.println("This loop ends here!");
//                break;
//            }
//        }
//
//        int i=0;
//        while (i<5){
//            System.out.println(i);
//            System.out.println("I will learn java by the end of this month.");
//            if (i == 2) {
//                System.out.println("This loop ends here!");
//                break;
//            }i++;
//        }

        for(int i=0;i<6;i++) {
            if (i == 2) {
                System.out.println("Loop ends here.");
                continue;
            }
            System.out.println(i);
            System.out.println("java is future!");
        }

    }
}