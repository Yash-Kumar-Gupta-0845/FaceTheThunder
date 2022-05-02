import java.util.*;
// By Iterative method
public class Binary_Search {
    public int BinSer(int A[],int n, int key) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int middle = ((left + right) / 2);
            if (key == A[middle])
                return middle;
            else if (key < A[middle])
                right = middle - 1;
            else if (key > A[middle])
                left = middle + 1;
        }
        return -1;
    }
    //By recursive method
    public int BinSerR(int A[],int key,int left,int right) {
        if (left > right)
            return -1;
        else {
            int mid = ((left + right) / 2);
            if (key == A[mid])
                return mid;
            else if (key < A[mid])
                return BinSerR(A, key, left, mid - 1);
            else if (key > A[mid])
                return BinSerR(A, key, mid + 1, right);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size ");
        int size=sc.nextInt();
        System.out.println("To be searched ");
        int ele=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter element in sorted way ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Binary_Search a=new Binary_Search();
        System.out.println("Element found at the index "+a.BinSer(arr,size,ele));
        System.out.println("Element found at the index recursively "+a.BinSerR(arr,ele,0,size-1));
    }
}
