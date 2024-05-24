
public class AutomorphicNumber {
	public static void isAutomorphicNumber(int n)
	{
		int temp=n;
		int square=n*n;
		while(n>0)
		{
			if(n%10!=square%10)
			{
				System.out.println("The number "+temp+" is not automorphic number");
				return;
			}
			else
			{
				n = n/10;   
				square = square/10;
			}
		}
		System.out.println("The number "+temp+" is automorphic number");
		return;
	}

}

