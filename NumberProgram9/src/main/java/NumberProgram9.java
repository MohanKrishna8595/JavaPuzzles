
public class NumberProgram9 
{
	public static void isPowerDigitSum(int pow,int base)
	{
		int res=(int)Math.pow(pow,base);
		int rem=0;
		int sum=0;
		while(res>0)
		{
			rem=res%10;
			sum=sum+rem;
			res=res/10;
		}
		System.out.println("The Power Digit Sum is "+sum);
	}
}
