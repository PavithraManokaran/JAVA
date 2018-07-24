import java.io.*;
import  java.util.*;
import java.lang.*;
// Read only region start
class UserMainCode
{

	public int EvenOddDigitsSum(int input1,String input2){
		// Read only region end
		// Write code here...
		int l=(int) Math.log10(input1)+1;;
		int sum=0,n;
		int fi=input1;
		if(input1<0)
		{
			input1=input1*-1;
		}
		
			while(input1!=0)
			{
				n=input1%10;
				if((n%2!=0)&&(input2.equals("odd")))
				{
				sum=sum+n;
				}
				if((n%2==0)&&(input2.equals("even")))
				{
					sum=sum+n;
				}
				input1=input1/10;
			}
		
		
		if(fi<0)
		return (-sum);
		else
			return (sum);

	}
}
