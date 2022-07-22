import java.util.*;

class BuildArrayFromPermutation{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr= new int[n];
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
        int[] arr= {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    static int[] buildArray(int[] nums)
    {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}