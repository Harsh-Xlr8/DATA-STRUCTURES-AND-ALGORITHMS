package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }}
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}



public class jp_practiceset_Accessmo_andCons {
    public static void main(String[] args) {
        // 1) Creating a class cylinder and using getter and setter to set its radius and height.
        cylinder mycylinder = new cylinder(2, 6);
        mycylinder.setHeight(6);
        int h = mycylinder.getHeight();
        mycylinder.setRadius(3);
        System.out.println(h);
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.surfaceArea());

// Overloading a constructor used to initialise a rectangle of length 4 and breadth 5 for using custom parameters.
        Rectangle r =new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
