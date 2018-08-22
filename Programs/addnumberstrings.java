import java.io.*;
import  java.util.*;
import java.lang.*;
import java.math.*;
// Read only region start
class UserMainCode
{

	public String addNumberStrings(String input1,String input2){
		// Read only region end
		// Write code here...
	    BigInteger a,b,value;
		a=new BigInteger(input1);
	    b=new BigInteger(input2);
	    value=a.add(b);
		String s ="";
		s=""+value;
		return s;
	}
}
