
public class NumberProgram10 
{
	public static void isFactorialDigitSum(int n)
	{
		int fact=1;
		int rem=0;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+n+" is "+fact);
		while(fact>0)
		{
			rem=fact%10;
			sum=sum+rem;
			fact=fact/10;
		}
		
		System.out.println("The factorial digit sum is "+sum);	
	}

}
