/* printing a node
class abc{
    int data;
    Node next;
    abc(int data){
        this.data=data;
    }
}
public class PrintLnkLst {
    static Node head;
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"  ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node n1=new Node(10);
        head=n1;
        Node n2=new Node(20);
        n1.next=n2;
        Node n3=new Node(30);
        n2.next=n3;
        print();
    }
}

 */

//to come to the second last position of the linked list

class abc{
    int data;
    Node next;
    abc(int data){
        this.data=data;
    }
}
public class PrintLnkLst {
    static Node head;
    static Node n1;
    public static void print(){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data+"  ");
            temp=temp.next;
        }
        n1=head;
    }

    public static void main(String[] args) {
        Node n1=new Node(10);
        head=n1;
        Node n2=new Node(20);
        n1.next=n2;
        Node n3=new Node(30);
        n2.next=n3;
        print();
    }
}
