
public class HollowRev {
	public void isHollowRev(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				if(j==i || i==1 || j==n)
				{
				  System.out.print("*"+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
