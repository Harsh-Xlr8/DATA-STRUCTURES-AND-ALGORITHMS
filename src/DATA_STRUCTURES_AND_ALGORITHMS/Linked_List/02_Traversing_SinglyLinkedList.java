package DATA_STRUCTURES_AND_ALGORITHMS.Linked_List;

 class nOde {
  int data;
  bode next;
  nOde(int x){
   data = x;
   next=null;
  }
}class Test{
 public static void main(String[] args) {
  bode head = new bode(10);
  head.next = new bode(20);
  head.next.next = new bode(30);
  head.next.next.next = new bode(40);
  printList(head);
 }
 public static void printList(bode head){
  bode curr = head;
  while(curr!=null){
   System.out.print(curr.data+" ");
   curr = curr.next;
  }
 }
}
