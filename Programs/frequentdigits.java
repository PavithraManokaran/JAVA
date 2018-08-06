import java.io.*;
import  java.util.*;
import java.lang.*;
// Read only region start
class UserMainCode
{

	public int MostFrequentDigit(int input1,int input2,int input3,int input4){
		// Read only region end
		String n=Integer.toString(input1)+Integer.toString(input2)+Integer.toString(input3)+Integer.toString(input4);
		int l=n.length();
		char temp[]=n.toCharArray();
		Arrays.sort(temp);
		String num=new String(temp);
		String arr[]=new String[l];
		int i=0,count=0,ele=0,max=0,j;
		for(i=0;i<l;i++)
		{
			count=0;
			for(j=0;j<l;j++)
			{
				if(num.charAt(i)==num.charAt(j))
				{
					count++;
				}
			}
			if(count>=max)
			{
				max=count;
				ele=num.charAt(i);
			}
	
		}
		return ele-48;
	}
}
