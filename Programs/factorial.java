import java.util.*;
class Main 
{
    public static void main (String[] args) 
    {
        Scanner v=new Scanner(System.in);
        int n;
        System.out.println("Enter the number to find factorial:");
        n=v.nextInt();
        factorial(n);
    }
    
    public static int factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial ");
        System.out.println(fact);
        return 0;
    }
}

