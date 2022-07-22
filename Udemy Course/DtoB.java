import java.util.*;

class DtoB
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DtoBi(n));
    }

    static int DtoBi(int n)
    {
        if(n<0)
        {
            return -1;
        }
        else if(n==0)
        {
            return 0;
        }
        else
        {
            return n%2 + 10*DtoBi(n/2);
        }
    }

}