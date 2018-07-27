import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int isPalinNumPossible(int input1){
		// Read only region end
		// Write code here...
		String input= Integer.toString(input1);
		int[] charCount = new int[128];
                for(int i = 0 ; i < input.length() ; i++)
                {
                    charCount[(int)input.charAt(i)]++;
                }
                int oddCount = 0 ;
                for(int i  = 0 ; i < 128 ; i++)
                {
                    if(charCount[i] % 2!=0)
                    {
                        oddCount++;
                    }
                }

                if(oddCount != 0 && oddCount != 1)
                {
                    return 1;
                }
                return 2;
	}
}
