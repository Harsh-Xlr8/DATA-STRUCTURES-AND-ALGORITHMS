package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
class MymainEmployee{
    private String name;
    private int id;
    public String getName(){return name;}
    public void setName(String n){this.name = n;}
    public void setid(int i){this.id = i;}
    public int getId(){return id;}
    public MymainEmployee(String myname, int myid){
        id = myid;
        name  = myname;
    } public MymainEmployee(String yourName){
        name  = yourName;
    }

}
public class jp_constructors {
    public static void main(String[] args) {
MymainEmployee harsh = new MymainEmployee("Deathbringer");
//harsh.setName("DeathBringer");
//harsh.setid(3);
        System.out.println(harsh.getId());
        System.out.println(harsh.getName());
    }
}
