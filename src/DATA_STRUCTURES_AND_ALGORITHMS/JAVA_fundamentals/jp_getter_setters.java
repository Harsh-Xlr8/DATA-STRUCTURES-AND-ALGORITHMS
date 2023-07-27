package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;


    class Myemployee {
        private int id;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String n) {
            this.name = n;
        }

        public void setId(int i) {
            this.id = i;
        }

        public int getId() {
            return id;
        }
    }
public class jp_getter_setters {
    public static void main(String[] args) {
        Myemployee Harsh = new Myemployee();
        Harsh.setName("Software Developer");
        System.out.println(Harsh.getName());
        Harsh.setId(45);
        System.out.println(Harsh.getId());
    }
}