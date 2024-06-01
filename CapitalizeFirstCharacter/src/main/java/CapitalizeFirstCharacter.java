
public class CapitalizeFirstCharacter {
	public  void isCapitalize(String str)
	{
		String arr[]=str.split(" ");
		String str2="";
		String nstr="";
		for(int i=0;i<=arr.length-1;i++)
		{
			str2=str2+arr[i];
			char c=' ';
			c=str2.charAt(0);
			nstr=nstr+Character.toUpperCase(c);
			for(int j=1;j<=str2.length()-1;j++)
			{
				nstr=nstr+str2.charAt(j);
			}
			nstr=nstr+" ";
			str2="";
		}
		System.out.println(nstr);
	}

}
