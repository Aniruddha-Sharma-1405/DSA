import java.util.*;
class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(Factorial(r));
    }
    static int Factorial(int n)
    {
        if(n<0)
        {
            return -1;
        }
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return n * Factorial(n-1);
        }
    }

}