import java.util.*;

class Gcd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }

    static int GCD(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else if(a<0 || b<0)
        {
            return -1;
        }
        else
        {
            return GCD(b,a%b);
        }
    }
}