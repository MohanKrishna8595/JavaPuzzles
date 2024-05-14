
public class NumberProgram1 
{
	public void isharshad(int n)
	{
		int sum=0,rem=0,temp=0;
		for(int i=1;i<=n;i++)
		{
			sum=0;
			rem=0;
			temp=i;
			while(i>0)
			{
				rem=i%10;
				sum=sum+rem;
				i=i/10;
			}
			if(temp%sum==0)
			{
				System.out.print(temp+" ");
			}
			i=temp;
		}
	}

}
