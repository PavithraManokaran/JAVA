import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	int n;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the number:");
	n=num.nextInt();
	odd(n);
	}
	
	public static int odd(int a)
	{
	    if(a%2!=0)
	    {
	        System.out.println("It is odd");
	    }
	    else
	    {
	        System.out.println("It is not odd");
	    }
	    return 0;
	}
}
