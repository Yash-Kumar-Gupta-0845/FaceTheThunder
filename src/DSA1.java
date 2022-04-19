import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import java.util.*;
class A{
    int x;
    int y;
    A(int x,int y) {
        this.x = x;
        this.y = y;
    }

}
public class DSA1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A arr[]=new A[5];
        int i;
        for(i=0;i<5;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = new A(a, b);
            System.out.println(a);
            System.out.println(b);}

    }
}
