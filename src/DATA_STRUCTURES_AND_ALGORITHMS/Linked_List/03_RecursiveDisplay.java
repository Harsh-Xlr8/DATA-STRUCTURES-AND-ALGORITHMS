package DATA_STRUCTURES_AND_ALGORITHMS.Linked_List;

    class bode {
        int data;
        bode next;
        bode(int x){
            data = x;
            next = null;
        }
    }
    class TEST{
        public static void main(String[] args){
            bode head = new bode(10);
            head.next = new bode(20);
            head.next.next = new bode(30);
            head.next.next.next = new bode(40);
            rprint(head);
        }
        public static void rprint(bode head){
            if(head == null)
                return ;
            System.out.println(head.data+" ");
            rprint(head.next);
        }
    }

