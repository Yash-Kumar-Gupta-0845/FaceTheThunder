class Node4{
        int data;
        Node next;
        Node4(int data){
        this.data=data;
        }
}
public class DltAtPos {
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
        if (head == null) {
            head = n;
        }
        else {
            Node temp1 = head;
            while (temp1.next != null) {
                temp1 = temp1.next;
            }
            temp1.next = n;
        }
    }
    public static int count(){
        int c=0;
        Node temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void deleteAtPos(int Pos) {
        if (head == null)
            return;
        else {
            if (head.next == null) {
                if (Pos != 1) {
                    System.out.println("Invalid position");
                }
                else
                    head = null;
            }
            else {
                int c = 1;
                if (Pos > count())
                    System.out.println("invalid");
                else {
                    Node temp = head;
                    while (temp != null) {
                        if (c == Pos - 1)
                            break;
                        c++;
                        temp = temp.next;
                    }
                    temp.next = temp.next.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        DltAtPos obj=new DltAtPos();
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.deleteAtPos(3);
        print();
    }
}
