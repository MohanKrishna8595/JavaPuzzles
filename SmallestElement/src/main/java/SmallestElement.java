
public class SmallestElement {
public void isSmallest(int arr[])
{
	System.out.print("Array Elements: ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	int smallele=0;
	for(int i=0;i<=arr.length-2;i++)
	{
		for(int j=0;j<=arr.length-2;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("\nSmallest Element is : "+arr[0]);
}
}
