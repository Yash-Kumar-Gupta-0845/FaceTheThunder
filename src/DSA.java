import java.sql.SQLOutput;

class DS {
    int x;
    int y;
    DS(int x,int y){
        this.x=x;
        this.y=y;
    }
    DS(){}
}
public class DSA{
    public static void main(String[] args) {
        int c=100;
        DS obj=new DS(10,20);
        DS obj1=new DS(30,40);
        DS obj2=new DS(50,60);
        DS res=new DS();
        res.x=obj.x+obj1.x+obj2.x;
        res.y=obj.y+obj1.y+obj2.y;
        System.out.println(res.x);
        System.out.print(res.y);
    }
}
