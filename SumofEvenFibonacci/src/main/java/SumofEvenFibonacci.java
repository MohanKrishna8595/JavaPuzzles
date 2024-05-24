
public class SumofEvenFibonacci {
	public void isEvenfib(int n) 
	{
		int f1=1,f2=2,f3;
		int sum=2;
		while(f2<=n)
		{
			f3=f1+f2;
			if(f3%2 == 0)
			{
				sum=sum+f3;
			}
			f1=f2;
 			f2=f3;
		}
		System.out.println(sum);
	}
}
