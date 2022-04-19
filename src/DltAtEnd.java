class Node3{
    int data;
    Node next;
    Node3(int data){
        this.data=data;
    }
}
public class DltAtEnd {
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
        public void DeleteAtEnd(){
        if(head==null)
            return;
        else{
            Node temp=head;
            if(temp.next==null){
                head=null;
            }
            else{
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
            }
        }
        }

    public static void main(String[] args) {
        DltAtEnd obj=new DltAtEnd();
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.DeleteAtEnd();
        print();
    }
}
