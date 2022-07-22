import java.util.*;

class DecodeXoredArray{
    public static void main(String args[])
    {
        int[] arr = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(deco(arr,first)));
    }
    static int[] deco(int[] encoded,int first)
    {
        int[] ans = new int[encoded.length+1];
        ans[0]=first;
        ans[1]=encoded[0]^first;
        for(int i=2;i<encoded.length+1;i++)
        {
            ans[i]=encoded[i-1]^ans[i-1];
        }
        return ans;
    }
}