//creating a linked list with the help of insert_at_end function...
class Node1{
    int data;
    Node next;
    Node1(int data){
        this.data=data;
    }
}
public class CrtWthfun {
    static Node head;
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }
        public void insertAtEnd(int x) {
            Node n = new Node(x);
            //If the linked list is empty then we just put head=n within the if condition and all other to else
            if (head == null) {
                head = n;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = n;
            }
        }
        public static void main(String[] args) {
            CrtWthfun obj=new CrtWthfun();
            obj.insertAtEnd(10);
            obj.insertAtEnd(20);
            obj.insertAtEnd(30);
            obj.insertAtEnd(40);
            print();
        }
    }