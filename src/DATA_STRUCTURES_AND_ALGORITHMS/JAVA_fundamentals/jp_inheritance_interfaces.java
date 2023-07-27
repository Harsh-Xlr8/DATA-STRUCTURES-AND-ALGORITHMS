package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class mySampleClass implements childSampleInterface{
    public void meth3(){
        System.out.println("meth 3");
    }
    public void meth4(){
        System.out.println("meth 4");
    }
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
}
public class jp_inheritance_interfaces {
    public static void main(String[] args) {
        mySampleClass obj = new mySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
