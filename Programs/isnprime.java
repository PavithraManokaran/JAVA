import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner value=new Scanner(System.in);
		int n;
		System.out.println("Enter the number to check for prime or not:");
		n=value.nextInt();
		isprimeornot(n);
	}
	
	public static int isprimeornot(int number)
	{
	    int count=0;
	    if((number!=0)&&(number!=1))
	    {
	    for(int i=2;i<number;i++)
	    {
	        if((number%i==0)&&(count==0))
	        {
	        count++;
	        }
	    }
	    if(count==0)
	    {
	        System.out.println("prime");
	    }
	    else
	    {
	        System.out.println("not prime");
	    }
	    }
	    else
	    {
	        System.out.println("not prime");
	    }
	    return 0;
	}
}
