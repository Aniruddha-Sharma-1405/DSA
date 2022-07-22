import java.util.*;

class midarr{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(mid(arr)));

    }

    static int[] mid(int[] arr)
    {
        int[] ans=new int[arr.length-2];
        int a=0;
        for(int i=1;i<arr.length-1;i++)
        {
            ans[a]=arr[i];
            a++;
        }
        return ans;
    }
}