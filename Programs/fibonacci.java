import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner v=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=v.nextInt();
        fibonacci(n);
    }
    
    public static int fibonacci(int f)
    {
        int a=0,b=1,fibo=0;
        System.out.print("0 1");
        for(int i=2;i<f;i++)
        {
            fibo=a+b;
            a=b;
            b=fibo;
            System.out.print(" "+fibo);
        }
        return 0;
    }
}
     
  
