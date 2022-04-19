import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int s=0;
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }

        for(j=0;j<m;j++)
        {
            b[j]=sc.nextInt();
            s=s+b[j];
        }
        System.out.println(s/(m+n));
//        int k=0;
//        int c[]=new int[n+m];
//
//        while(i<n && j<m)
//        {
//            if(a[i] < b[j]){
//                a[k++] = a[i++];
//            }
//            else{
//                a[k++] = b[j++];
//            }
//        }
//        while(i<n)
//        {
//            c[k++]=a[i++];
//        }
//        while(j<m)
//        {
//            c[k++]=b[j++];
//        }
//        Arrays.sort(c);
//        int z=c.length-1;
//        if(z%2==0)
//        {
//            int even=(z+1)/2;
//
//            System.out.println(c[even]);
//        }
//        else
//        {
//            int odd=z/2;
//            System.out.println(c[odd]);
//        }
//
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
