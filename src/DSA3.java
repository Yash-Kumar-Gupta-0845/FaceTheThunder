import java.sql.SQLOutput;

class Node{
    int data;
    Node next;
    Node(int data){

        this.data=data;
    }
}
public class DSA3 {
    public static void main(String[] args) {
        Node head=null;
        Node n1=new Node(5);
        head=n1;
        Node n2=new Node(10);
        n1.next=n2;
        Node n3=new Node(15);
        n2.next=n3;
        System.out.println("Case 1- " +head.data);
        System.out.println("Case 2- "+head.next.data);
        System.out.println("Case 3- "+head.next.next.data);
        System.out.println("Special same as C1 "+n1.data);
        System.out.println("Special same as C2 "+n2.data);
        System.out.println("Special same as C3 "+n3.data);
        //System.out.println(head.next.next.next.data);//gives null pointer Exception
        System.out.println("Reference of n2 "+n2);
    }
}
