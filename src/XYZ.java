import java.util.*;
class Node5{
    int data;
    Node next;
    Node5(int data){
        this.data=data;
    }
}
public class XYZ {
    Node head=null;
    public void insrtatbeg(int x){
        Node n=new Node(x);
        n.next=head;
        head=n;

        if (head==null)
            head=n;
        else{
            Node temp=head;
            while(temp!=null){

                temp=temp.next;
            }
        }

    }
    public void delete(int pos){

    }

    public static void main(String[] args) {
        XYZ obj=new XYZ();
        Scanner sc= new Scanner(System.in);
        int z= sc.nextInt();
        obj.insrtatbeg(z);
        obj.delete(3);
    }
}
