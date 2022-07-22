import java.util.*;

class SumofDigitswithRecur{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumofDigits(n));
    }

    static int SumofDigits(int n)
    {
        if(n<0)
        {
            return -1;
        }
        else if(n/10==0)
        {
            return n;
        }
        else
        {
            return n%10 + SumofDigits(n/10);
        }
    }
}