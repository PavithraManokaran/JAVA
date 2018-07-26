import java.util.*;
import java.lang.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int l=(int) Math.log10(n)+1;
        palindrome(n,l);
    }
    
   public static int palindrome(int num,int len)
    {
        int i=0;
        int k=len-1;
        int count=0;
        int a[]=new int[len];
        int b[]=new int[len];
        while(num!=0)
        {
            int d=num%10;
            a[i]=d;
            i++;
            b[k]=d;
            k--;
            num=num/10;
        }
        for(int j=0;j<len;j++)
         {
             if(a[j]==b[j])
             {
                count++;
             }
         }
         if(count==len)
         {
             System.out.println("It is palindrome");
         }
         else
             System.out.println("It is not palindrome");
        return 0;
    }
}
