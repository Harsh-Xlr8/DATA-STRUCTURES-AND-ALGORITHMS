package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

public class BuildStackMain {
    public class CustomStack{
    int data[];
    int tos;  // top of the stack
        public CustomStack(int cap){
        data = new int[cap];
        tos = -1;
        }
        int size(){
            return tos+1;
        }
        int top(){
            if(tos == -1){
                System.out.println("Stack Underflow");
            }
            return data[tos];
        }
        int pop(){
            if(tos == -1){
                System.out.println("Stack Underflow");
            }
                int val =  data[tos];
                tos--;
                return val;
        }
        void display(){
            while(tos >= 0){
                System.out.print(data[tos]);
            }
            System.out.println();
        }
        void push(int val){
            if(tos == data.length -1){
                System.out.println("Stack Overflow");
            }else{
                tos++;
                data[tos] = val;
            }
        }
    }
}
