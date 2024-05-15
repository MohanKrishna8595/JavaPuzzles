
public class Numberprogram5 
{
	public static void isLargestPalindrome()
	{
		int Largestpal=0;
		int max=0;
		int min=0;
		int pro=0;
		for(int n1=10;n1<=999;n1++)
		{
			for(int n2=10;n2<=999;n2++)
			{
				pro=n1*n2;
				if(isPal(pro) && pro >Largestpal)
				{
					Largestpal=pro;
					max=n1;
					min=n2;
				}
			}
		}
		System.out.println("Largest Palindrome number "+Largestpal);
		System.out.println("Product of two 3-digit number is "+max+" x "+min+" = "+Largestpal);
	}
	public static boolean isPal(int n)
	{
		int rev=0,rem=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
