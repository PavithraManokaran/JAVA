//Declare header and also assign input1,input2,input3;

int r1,r2,r3,x=0,c=0,d=3,min1=9,min2=9,min3=9,i=0,j=0,max=0,m=0,n=0;
		int a[]=new int[9];
		int b[]=new int[4];
		while(input1!=0)
		{
			r1=input1%10;
			a[x]=r1;
			x++;
			c++;
			input1=input1/10;
		}
		while(input2!=0)
		{
			r2=input2%10;
			a[c]=r2;
			c++;
			d++;
			input2=input2/10;
		}
		while(input3!=0)
		{
			r3=input3%10;
			a[d]=r3;
			d++;
			input3=input3/10;
		}
		for(i=0;i<9;i+=3)
		{
			if(a[i]<min1)
			{
				min1=a[i];
			}
		}
		b[j]=min1;
		j++;
		for(m=7;m>=0;m-=3)
		{
			if(a[m]<min2)
			{
				min2=a[m];
			}
		}
		b[j]=min2;
		j++;
		for(n=8;n>=0;n-=3)
		{
			if(a[n]<min3)
			{
				min3=a[n];
			}
		}
		b[j]=min3;
		j++;
		for(i=0;i<9;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		b[j]=max;
		int result=((b[3]*1000)+(b[2]*100)+(b[1]*10)+(b[0]));
		return result;
	}
