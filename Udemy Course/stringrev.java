import java.util.*;

class stringrev{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(rev(str));
    }
    static String rev(String str)
    {
        if(str.length()==1)
        {
            return str;
        }
        else
        {
           return str.charAt(str.length()-1)+rev(str.substring(0,str.length()-1));
        }
    }
}