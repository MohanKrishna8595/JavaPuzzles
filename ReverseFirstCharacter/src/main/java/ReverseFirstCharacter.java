
public class ReverseFirstCharacter {
	public static void isReverse(String str)
	{
		char arr[]=str.toCharArray();
		char temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		String newstr="";
		for(int i=0;i<=arr.length-1;i++)
		{
			newstr=newstr+arr[i];
		}
		System.out.println(newstr);
		
	}

}
