
public class MergeArray {
	public void isMerge(int arr1[],int arr2[])
	{
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int i=0;i<=arr2.length-1;i++)
		{
		    arr3[arr1.length+i]=arr2[i];
		}
		for(int i=0;i<=arr3.length-1;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
	}

}
