class Node2{
    int data;
    Node next;
    Node2(int data){
        this.data=data;
    }
}
public class DltAtBgn {
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
    // deleting the first element of the linked list
    public void DeletetionAtBegining() {
        if (head == null)
            return;
        else {
            head = head.next;
        }
    }
    public static void main(String[] args) {
        DltAtBgn obj=new DltAtBgn();
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.DeletetionAtBegining();
        print();
    }
}
