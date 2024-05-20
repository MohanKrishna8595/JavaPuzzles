
public class NumberProgram14 
{
	public static void isDigitFactorials(int n)
	{
		int rem=0;
		int sum=0;
		int fact=1;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
			fact=1;
		}
		if(temp==sum)
		{
			System.out.println("The number "+temp+" is Digit Factorials");
		}
		else
		{
			System.out.println("The number "+temp+" is not Digit Factorials");
		}
	}

}
