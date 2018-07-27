import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int totalHillWeight(int input1,int input2,int input3){
		// Read only region end
		// Write code here...
		
		int sum=0;
		int a=1;
		while(input1!=0)
		{
			sum=sum+(input2*a);
			a++;
			input2=input2+input3;
			input1--;
		}
		return sum;
	}
}
