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
        numberofeven(a);
    }
    
    public static int numberofeven(int array[])
    {
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                count=count+1;
            }
        }
        System.out.println("NUMBER "+count);
        return 0;
    }
}
