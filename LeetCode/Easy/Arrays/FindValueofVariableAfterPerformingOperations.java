import java.util.*;

class FindValueofVariableAfterPerformingOperations{
    public static void main(String args[])
    {
        String[] arr = {"--X","X++","X++"};
        System.out.println(find(arr));
    }

    static int find(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].charAt(1)=='+')
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        return x;
    }
}