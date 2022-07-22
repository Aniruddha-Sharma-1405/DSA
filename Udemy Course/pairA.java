import java.util.*;


class pairA{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        pair(arr);
    }

    static void pair(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}