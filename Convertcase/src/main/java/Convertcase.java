
public class Convertcase 
{
	public void isConvert(String str)
	{
		String nstr="";
		char ch=' ';
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
			    ch=str.charAt(i);
			    nstr=nstr+Character.toLowerCase(ch);
			} 
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				ch=str.charAt(i);
				nstr=nstr+Character.toUpperCase(ch);
			}
			else
			{
				nstr=nstr+str.charAt(i);
			}
		}
		System.out.println("Modified String: "+nstr);
	}

}
