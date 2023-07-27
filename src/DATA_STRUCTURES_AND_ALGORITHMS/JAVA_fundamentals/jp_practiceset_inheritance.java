package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
class circle{
    public int radius;
    circle(int r){
        System.out.println("I am circle parameterized constructor.");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius* this.radius;
    }
}class cylinders extends circle{
    public int height;
    cylinders(int r,int h){
    super(r);
        System.out.println("I am cylinder parameterized constructor.");
    this.height = h;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }}
        public class jp_practiceset_inheritance {
            public static void main(String[] args) {
cylinders obj1 = new cylinders(6,3);
circle obj2 = new circle(12);

            }
        }


