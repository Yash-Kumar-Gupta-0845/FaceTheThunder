public class TailHeadRecursion {
    public void calculateTail(int n){
        if(n>0) {
            //Tail Recursion
            int k = n * n;
            System.out.println(k);
            calculateTail(n - 1);
            //no statement after the recursive call
        }
    }
    public void calculateHead(int n){
        if(n>0){
            //head recursion
            //no statement before the recursive call
            calculateHead(n-1);
            int k=n*n;
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        TailHeadRecursion r=new TailHeadRecursion();
        System.out.println("Tail  ");
        r.calculateTail(5);
        System.out.println("-------------------");
        System.out.println("Head  ");
        r.calculateHead(5);
    }
}
