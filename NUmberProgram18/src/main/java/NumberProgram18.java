
public class NumberProgram18 {
	public static void isPerfectSquare(int n)
	{
		int sqrt=(int)Math.sqrt(n);
		if(sqrt*sqrt==n)
		{
			System.out.print("The number "+n+" is a Perfect Square");
		}
		else
		{
			System.out.print("The number "+n+" is not a Perfect Square");
		}
	}

}
