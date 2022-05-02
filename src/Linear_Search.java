import java.util.*;
public class Linear_Search {
    public int LinSer(int a[],int n,int k){
        int index=0;
        while(index<n){
            if(a[index]==k)
                return index;
            index+=1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Linear_Search A = new Linear_Search();
        Scanner sc = new Scanner(System.in);
        System.out.println("Size ");
        int size = sc.nextInt();
        System.out.println("Element to be searched ");
        int search = sc.nextInt();
        System.out.println("Enter elements ");
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int found = A.LinSer(a, size, search);
        System.out.println("Result: " + found);
    }
}
