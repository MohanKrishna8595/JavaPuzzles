
public class NumberProgram8 
{
	public static void isSumofPrime(int n)
	{
		int count=0;
		int sum=0;
		
		for(int i=1;i<n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
				   count++;	
				}
			}
			if(count==2)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
