import java.util.*;

class DecompressRunLengthEncodedList{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(decom(arr)));
    }
    static int[] decom(int[] nums)
    {
        int len=0;
        for(int i=0;i<nums.length;i+=2)
        {
            len+=nums[i];
        }
        int[] ans = new int[len];
        int a=0;
        for(int i=0;i<nums.length/2;i++)
        {
            int freq = nums[2*i];
            int val = nums[2*i+1];
            for(int j=0;j<freq;j++)
            {
                ans[a]=val;
                a++;
            }
        }
        return ans;
    }
}