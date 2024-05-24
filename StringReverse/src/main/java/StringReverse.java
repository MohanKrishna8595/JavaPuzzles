
public class StringReverse {
	
	public static void isStringReverse(String str)
	{
		char arr[] =str.toCharArray();
		char rarr[]= new char[arr.length];
		int j=arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			rarr[j]=arr[i];
			j--;
		}
		String revstr = new String(rarr);
		System.out.println(revstr);
		
	}
}
