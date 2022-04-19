import java.util.*;

public class th {
    public void recursive(int n){
        if(n>0){
            int k= (int) Math.pow(2,n);
            int j=k-1;
            System.out.println(j);
            recursive(n-1);
        }
    }

    public static void main(String[] args) {
        th r=new th();
        r.recursive(3);
    }
}
