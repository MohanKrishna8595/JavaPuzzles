
public class ReverseOrderofWord {
	public static void isReverseOrder(String str)
	{
		String arr[] = str.split(" ");
		String newstr="";
		for(int i=arr.length-1;i>=0;i--)
		{
			newstr=newstr+arr[i]+" ";
		}
		System.out.println(newstr);
	}

}
