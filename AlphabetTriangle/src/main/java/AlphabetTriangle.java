
public class AlphabetTriangle {
	public void isAlphabet(int n)
	{
		int a=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char) a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
