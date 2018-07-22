import java.util.*;
class Main
{
    public static void main(String args[])
    {
      int n,m;
      Scanner num=new Scanner(System.in);
      System.out.println("Enter the number:");
      n=num.nextInt();
      System.out.println("Enter the multiple number:");
      m=num.nextInt();
      multiple(n,m);
    }
    
    public static int multiple(int a,int b)
    {
        if(a%b==0)
        {
            System.out.println(a+" is exact multiple of "+b);
        }
        else
        {
            System.out.println(a+" is not an exact multiple of "+b);
        }
    return 0;
    }
}
