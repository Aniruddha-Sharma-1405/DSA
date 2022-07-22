import java.util.*;

class maxprod{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(max(arr));
    }
    static String max(int[] intArray)
    {
        int temp = intArray[0]*intArray[1];
        int a =0;
        int b =0;
        String str ="";
        for(int i=0;i<intArray.length;i++)
        {
            for(int j=i+1;j<intArray.length;j++)
            {
                int prod = intArray[i]*intArray[j];
                if(prod>temp)
                {
                    temp = prod;
                    a = intArray[i];
                    b = intArray[j];
                }
            }

        }
        str = str+"("+a+","+b+")";
        return str;
    }
}