class abcd{
    int data;
    Node next;
    abcd(int data){
        this.data=data;
    }
}
public class InsertAtPosition {
    static Node head;
    public void insertAtPos(int pos,int dt){
        Node n=new Node(dt);
        if (head==null){
            if (pos>1){
                System.out.println("invalid");
            }
            else{
                head=n;
            }
        }
        else{
            if (pos == 1) {
                n.next=head;
                head=n;
            }
            else if(pos >count()+1){
                System.out.println("invalid position");
            }
            else{
                Node temp=head;
                int c=1;
                while(temp.next!=null){
                 if(c==pos-1){
                     break;
                 }
                 c++;
                 temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
            }
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
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"  ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        InsertAtPosition obj=new InsertAtPosition();
        Node n1=new Node(10);
        //obj.head=n1;
        head=n1;
        Node n2=new Node(20);
        n1.next=n2;
        Node n3=new Node(30);
        n2.next=n3;
        obj.insertAtPos(2,50);
        print();
    }
}