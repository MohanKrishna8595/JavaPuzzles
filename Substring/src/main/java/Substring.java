
public class Substring {
	public void isSubstring(String str)
	{
		char arr[]=str.toCharArray();
		String nstr="";
		for(int i=0;i<=arr.length-1;i++)
		{
			nstr="";
			for(int j=i;j<=arr.length-1;j++)
			{
				nstr=nstr+arr[j];
				System.out.println(nstr);
			}
		}

	}
}
