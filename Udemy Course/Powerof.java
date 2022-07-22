import java.util.*;

class Powerof
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Powerof(x,n));
    }

    static int Powerof(int x, int n)
    {
        if(n<0)
        {
            return -1;
        }
        else if(n==0)
        {
            return 1;
        }
        else
        {
            return x*Powerof(x,n-1);
        }
    }
}