import java.io.*;
import  java.util.*;
import java.lang.*;
// Read only region start
class UserMainCode
{

	public int getCodeThroughStrings(String input1){
		// Read only region end
		// Write code here...
        int count=0,rem=0,sum=0;
		for(int i=0;i<input1.length();i++)
		{
			if(input1.charAt(i)!=' ')
			{
				count++;
			}
		}
		while(sum==0)
		{
			
		while(count!=0)
		{
			rem=count%10;
			sum=sum+rem;
			count=count/10;
		}
		if(sum>9)
		{
		count=sum;
		sum=0;
		}
			
		}
		return sum;

	}
}
