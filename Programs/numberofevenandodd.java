import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner v=new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements:");
        n=v.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=v.nextInt();
        }
        numberofoddandeven(a);
    }
    
    public static int numberofoddandeven(int array[])
    {
        int evencount=0,oddcount=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                evencount++;
            }
            if(array[i]%2!=0)
            {
                oddcount++;
            }
        }
        System.out.println("Number of even "+evencount);
        System.out.println("Number of odd "+oddcount);
        return 0;
    }
}
