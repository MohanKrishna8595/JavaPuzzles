
public class RemoveDuplicateCharacters {
	public static void isRemoveDuplicate(String str)
	{
		String newstr="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(!newstr.contains(str.charAt(i)+""))
			{
				newstr=newstr+str.charAt(i);
			}
		}
		System.out.println(newstr);

	}

}
