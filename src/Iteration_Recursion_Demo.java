import java.sql.SQLOutput;

public class Iteration_Recursion_Demo {
    //iterative method
    public void calculateIterative(int n){
        while(n>0){
            int k=n*n;
            System.out.println(k);
            n=n-1;
        }
    }
    //recursive method
    public void calculateRecursive(int n){
        if(n>0){              //base condition
            int k=n*n;
            System.out.println(k);
            calculateIterative(n-1);    //function call
        }
    }

    public static void main(String[] args) {
        Iteration_Recursion_Demo r=new Iteration_Recursion_Demo();
        r.calculateIterative(5);
        System.out.println("-----------------");
        r.calculateRecursive(5);
    }
}
