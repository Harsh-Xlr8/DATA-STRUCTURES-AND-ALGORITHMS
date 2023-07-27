package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_method_overloading {
//static void change(int[] arr){
//
//arr[0]=40;
//}
//
//   public static void main(String[] args) {
//        int []marks= {39,38,37,40,39};
//        change(marks);
//        System.out.println(marks[0]);
    static void foo(){
        System.out.println("good morning bro!");
    }

static void foo(int a){
    System.out.println("good morning "+ a +" bro!");

}static void foo(int a, int b) {
        System.out.println("good morning " + a + " bro!");
        System.out.println("good night " + b + " bro!");
    }
    public static void main(String[] args) {
        foo();
        foo(3000 );
        foo(3000,4000);
        //arguments are actual!
    }
    }
