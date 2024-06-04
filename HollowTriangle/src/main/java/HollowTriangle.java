
public class HollowTriangle {
	public void ishollow(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==4 || j==i )
				{
				   System.out.print("*"+" ");
				}
				else
				{
					System.out.print("  ");
				}
				System.out.println();
			}
		}	
	}
}
