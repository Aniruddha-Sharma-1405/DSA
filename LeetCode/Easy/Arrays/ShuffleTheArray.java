import java.util.*;

class ShuffleTheArray{
    public static void main(String args[])
    {
        int[] arr = {2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(sta(arr,n)));
    }
    static int[] sta(int[] nums,int n)
    {
        int[] ans = new int[2*n];
        int e=0;
        int odd=1;
        for(int i=0;i<2*n;i++)
        {
            if(i>=n)
            {
                ans[odd]=nums[i];
                odd=odd+2;
            }
            else
            {
                ans[e]=nums[i];
                e=e+2;
            }
        }
        return ans;
    }
}