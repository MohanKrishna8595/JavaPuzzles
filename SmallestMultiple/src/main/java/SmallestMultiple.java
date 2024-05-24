
public class NumberProgram11 
{
	public static void isSmallestMultiple(int n)
	{
		while(true)
		{
			if(isdivisible(n))
			{
				System.out.println("The smallest number divisible by all of numbers from 1 to 20 is "+n);
				break;
			}
			else
			{
				n=n+1;
			}
		}
		
	}
	public static boolean isdivisible(int n)
	{
		for(int i=1;i<=20;i++)
		{
			if(n%i!=0)
			{
				return false;
			}
		}
		return true;
		
	}

}
