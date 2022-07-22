import java.util.*;

class TwoSum{
    public static void main(String args[]) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int[] r = new int[2];
        while(i<j)
        {
            if(nums[i]+nums[j]==target)
            {
                r[0]=i;
                r[1]=j;
                return r;
            }
            else if(j==i+1)
            {
                i++;
                j=nums.length-1;
            }
            j--;
        }
        return r;
    }
}