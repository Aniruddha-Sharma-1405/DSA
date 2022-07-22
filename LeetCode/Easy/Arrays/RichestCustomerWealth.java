import java.util.*;

class RichestCustomerWealth{
    public static void main(String args[])
    {
        int[][] arr = {{1,2,3},{3,2,1}};
        System.out.println(rcw(arr));
    }
    static int rcw(int[][] accounts)
    {
        int max=0;
        for(int i=0;i<accounts.length;i++)
        {
            int curr=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                curr+=accounts[i][j];
            }
            if(curr>max)
            {
                max = curr;
            }
        }
        return max;
    }
}