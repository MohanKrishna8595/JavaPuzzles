
public class NumberProgram16 
{
	public static void isReverse(int n)
	{
		int rem=0;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("The reverse of a number is "+rev);
	}
}
