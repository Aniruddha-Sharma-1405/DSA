import java.util.*;

class KidsWiththeGreatestNumberofCandies{
    public static void main(String args[])
    {
        int[] arr = {2,3,5,1,3};
        int e = 3;
        System.out.println(kwgnoc(arr,e));
    }
    static List<Boolean> kwgnoc(int[] candies, int extraCandies)
    {
        int max=0;
        List<Boolean> ans = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(max<=candies[i]+extraCandies)
            {
                ans.add(true);
            }
            else {
               ans.add(false);
            }
        }
        return ans;
    }
}