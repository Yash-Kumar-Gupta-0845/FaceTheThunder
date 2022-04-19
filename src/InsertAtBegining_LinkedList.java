class Ab{
    int data;
    Node next;
    Ab(int data){
        this.data=data;
    }
}
public class InsertAtBegining_LinkedList {
    static Node head;
    public void insertAtBegin(int x){
        Node n=new Node(x);
        n.next=head;
        head=n;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"  ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        InsertAtBegining_LinkedList obj=new InsertAtBegining_LinkedList();
        Node n1=new Node(10);
        //obj.head=n1;
        head=n1;
        Node n2=new Node(20);
        n1.next=n2;
        Node n3=new Node(30);
        n2.next=n3;
        obj.insertAtBegin(50);
        print();
    }
}
