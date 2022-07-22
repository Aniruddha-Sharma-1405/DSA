import java.util.*;

class sumpair{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int b = 9;
        System.out.println(Arrays.toString(pairs(arr,b)));
    }

    static int[] pairs(int[] nums, int target)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No Solution Found");
    }
}