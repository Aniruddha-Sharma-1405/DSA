import java.util.*;

class prodofarr{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(prod(arr,n));
    }
    static int prod(int[] arr,int n)
    {
        if(n==0)
        {
            return arr[0];
        }
        else if(n<0)
        {
            return -1;
        }
        else
        {
            return arr[n-1]*prod(arr,n-1);
        }
    }
}