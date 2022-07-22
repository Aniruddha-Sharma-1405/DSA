import java.util.*;

class MN{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        missingNumber(arr);
        simplemiss(arr);
    }

    static void missingNumber(int[] arr)
    {
        int sum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==sum)
            {
                sum++;
            }
            else {
                System.out.println(sum);
                sum=sum+2;
            }
        }
    }
    static void simplemiss(int[] arr)
    {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            sum1+=arr[i];
        }
        sum2=((arr.length)*(arr.length+1))/(2);

        System.out.println(sum1-sum2);
    }
}