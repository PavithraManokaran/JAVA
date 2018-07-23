import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner value=new Scanner(System.in);
		int n,l,d,b,u=0,i=0,count=0;
		System.out.println("Enter the number:");
		n=value.nextInt();
		l=(int)Math.log10(n)+1;
	    int a[]=new int[l];
	    
	    while(n!=0)
	    {
	        d=n%10;
	        a[i]=d;
	        i++;
	        n=n/10;
	    }
	    for(i=0;i<l;i++)
	    {
	        System.out.println(a[i]);
	    }
	   for(int k=0;k<l;k++)
	    {
	        for(int j=k;j<l;j++)
	        {
	            if(a[k]!=a[j])
	            {
	                u++;
	            }
	        }
	        if(u!=0)
	        {
	            count++;
	        }
	        u=0;
	    }
	    System.out.println(count);
	}
}
