
public class NumberProgram12 {
	public static void isLargestDigit(int n)
	{
		int rem=0;
		int lar=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			if(rem>lar)
			{
				lar=rem;
			}
		}
		System.out.println("The largest digit in a number is "+lar);
	}
}
