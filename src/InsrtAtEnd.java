class Abc{
    int data;
    Node next;
    Abc(int data){
        this.data=data;
    }
}
public class InsrtAtEnd {
    static Node head;
    public void insertAtEnd(int x) {
        Node n = new Node(x);
        //If the linked list is empty then we just put head=n within the if condition and all other to else
        if (head == null) {
            head = n;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"  ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        InsrtAtEnd obj=new InsrtAtEnd();
        Node n1=new Node(10);
        //obj.head=n1;
        head=n1;
        Node n2=new Node(20);
        n1.next=n2;
        Node n3=new Node(30);
        n2.next=n3;
        obj.insertAtEnd(50);
        print();
    }
}