
public class ArmstrongNumber 
{
	public static String isArmstrongNumber(int n)
	{
		String str = n+"";
		int exp = str.length();
		int rem=0;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(int)Math.pow(rem, exp);
			n=n/10;
		}

		if(temp==sum)
		{
			return "Armstrong Number";
		}
		else
		{
			return "Not Armstrong Number";
		}


	}
}
