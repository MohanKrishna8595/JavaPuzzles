
public class NumberProgram7 
{
	public static void isnthPrime(int n)
	{

		int primenum=0;
		int count1=0;
		int count2=0;
		for(int i=1;count2<=n;i++)
		{
			count1=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count1++;
				}
			}
			if(count1==2)
			{
				primenum=i;
				count2++;
			}
			if(count2==n)
			{
				break;
			}

		}
		System.out.println("The "+n+" prime number is "+primenum);

	}
}	