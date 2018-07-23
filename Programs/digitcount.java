import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner value=new Scanner(System.in);
		int n,l;
		System.out.println("Enter the number:");
		n=value.nextInt();
		l=(int)Math.log10(n)+1;
	    System.out.println(l);
	}
	

}
