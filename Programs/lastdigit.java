import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	int n;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the number:");
	n=num.nextInt();
	System.out.println("The last digit is "+ last(n));
	}
	
	public static int last(int a)
	{
	    int l;
	    l=a%10;
	    return l;
	}
}
