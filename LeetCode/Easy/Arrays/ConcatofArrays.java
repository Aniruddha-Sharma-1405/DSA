import java.util.*;

class ConcatofArrays{
    public static void main(String[] args)
    {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(conca(nums)));
    }
    static int[] conca(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}