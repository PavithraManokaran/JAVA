import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	int n;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the number:");
	n=num.nextInt();
	even(n);
	}
	
	public static int even(int a)
	{
	    if(a%2==0)
	    {
	        System.out.println("It is even");
	    }
	    else
	    {
	        System.out.println("It is not even");
	    }
	    return 0;
	}
}
