import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner value=new Scanner(System.in);
		int n,m;
		System.out.println("Enter the number range:");
		n=value.nextInt();
			m=value.nextInt();
		isprimeornot(n,m);
	}
	
	public static int isprimeornot(int start,int end)
	{
	    int c=0,prime=0;
	    for(int j=start;j<=end;j++)
{
for (int i = 1; i <= start; i++) 
  {
      if (start% i == 0)
      {
          c++;
      }
  }
if (c == 2) 
  {
  prime++;
  }
 start++;
  c=0;
}
System.out.println(prime);
return 0;
	}
}
