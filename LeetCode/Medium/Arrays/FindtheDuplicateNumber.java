import java.util.*;

class FindtheDuplicateNumber{
    public static void main(String args[])
    {
        int[] arr = {1,3,4,2,2};
        System.out.println(dup(arr));
    }
    static int dup(int[] nums)
    {
        int[] count = new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
            if(count[nums[i]]>1)
            {
                return nums[i];
            }
        }
        return 0;
    }
}