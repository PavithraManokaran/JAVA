import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	int n1,n2;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the first number:");
	n1=num.nextInt();
    System.out.println("Enter the second number:");
	n2=num.nextInt();
	System.out.println("The two numbers last digit's sum is "+ lastdigitsum(n1,n2));
	}
	
	public static int lastdigitsum(int a,int b)
	{
	    int l1,l2,sum;
	    l1=a%10;
	    l2=b%10;
	    sum=l1+l2;
	    return sum;
	}
}
