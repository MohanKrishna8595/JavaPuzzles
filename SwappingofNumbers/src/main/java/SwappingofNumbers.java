
public class SwappingofNumbers {
	public void isSwap(int a,int b)
	{
		System.out.print("Before Swapping: ");
		System.out.print("a = "+a+" b = "+b);
		
		int temp =a;
		a=b;
		b=temp;
		System.out.print("\nAfter  Swapping: ");
		System.out.print("a = "+a+" b = "+b);
	}

}
