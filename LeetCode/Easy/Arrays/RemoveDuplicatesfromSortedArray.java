import java.util.*;

class RemoveDuplicatesfromSortedArray{
    public static void main(String args[])
    {
        int[] arr={1,1,2};
        System.out.println(sore(arr));
    }
    static int sore(int[] nums)
    {
        int i =0,j=i+1;
        while(j<nums.length)
        {
            if(nums[i]==nums[j])
            {
                j++;
            }
            else
            {
                int temp =nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        return i+1;
    }
}