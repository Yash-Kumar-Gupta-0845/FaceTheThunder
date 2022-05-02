import java.sql.SQLOutput;

public class R_Sum_of_n_number{
    // by formula
    public int sum(int i){
        return i*(i+1)/2;
    }
    // by iteration
    public int sumi(int j){
        int total=0;
        int a=1;
        while (a<=j) {
            total += a;
            a += 1;
        }
        return total;
        }
        // by recursion
    public int sumr(int k){
        if (k==0)
            return 0;
        return sumr(k-1)+k;
    }
    public static void main(String[] args) {
        R_Sum_of_n_number r=new R_Sum_of_n_number();
        System.out.println("sum "+r.sum(5));
        System.out.println("sum "+r.sumi(5));
        System.out.println("sum "+r.sumr(5));

    }
}