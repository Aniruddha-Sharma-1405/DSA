import java.util.*;

class ShuffleString{
    public static void main(String[] args)
    {
        String s = "codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    static String restoreString(String s, int[] indices)
    {
        char[] arr = new char[indices.length];
        for(int i=0;i<indices.length;i++)
        {
            arr[indices[i]]=s.charAt(i);
        }
        String res = new String(arr);
        return res;
    }
}