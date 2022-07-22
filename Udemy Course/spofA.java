import java.util.*;


class spofA{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        spof(arr);
    }
    static void spof(int[] arr)
    {
        int sum=0;
        int prod = 1;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            prod *=arr[i];
        }
        System.out.println(sum+" "+prod);
    }
}