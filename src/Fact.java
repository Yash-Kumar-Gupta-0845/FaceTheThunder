public class Fact {
    public int itFact(int n) {
        int fact = 1;
        for (int i = 1; i < n+1; i++)
            fact = fact * i;
            return fact;
    }
    public int Factorial(int n){
        if (n==0)
            return 1;
        return Factorial(n-1)*n;
    }

    public static void main(String[] args) {
        Fact n=new Fact();
        System.out.println(n.Factorial(5));
        System.out.println(n.itFact(4));
    }
}
