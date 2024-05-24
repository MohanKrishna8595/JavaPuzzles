import java.util.Scanner;

public class NumberProgram6 
{
	public static void isLargestPrimefact(int n)
	{
		int count=0;
		int LargestPrimeFact=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
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
					if(i>LargestPrimeFact)
					{
					  LargestPrimeFact=i;
					}
				}
			}
		}
		System.out.println("Largest Prime Factor:"+LargestPrimeFact);
	}
}
