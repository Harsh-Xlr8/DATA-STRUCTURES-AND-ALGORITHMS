package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_methods {
    static int logic(int a, int b) {
        int c;
        if (a > b) {
            c = a+b;
        }else{
            c= (a+b)*3;
        }return c;
    }
    public static void main(String[] args) {
     int x= 3;
     int y= 5;
     int z;
        //jp_methods obj= new jp_methods();---> Method invocation using object creation
        // z= obj.logic(x,y);
                z = logic(x,y);
        System.out.println(z);
        int c1= 34;
        int c2= 32;
        int c3;
        //jp_methods ob= new jp_methods();---> Method invocation using object creation
        // c3= ob.logic(c1,c2);
        c3= logic(c1,c2);
        System.out.println(c3);

}}
