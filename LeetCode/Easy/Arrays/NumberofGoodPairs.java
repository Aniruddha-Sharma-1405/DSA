import java.util.*;

class NumberofGoodPairs{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(nogp(arr));
    }
    static int nogp(int[] nums)
    {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}