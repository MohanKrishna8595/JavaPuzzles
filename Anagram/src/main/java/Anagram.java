import java.util.*; 
public class Anagram 
{
	public static String isAnagram(String s1,String s2)
	{
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String newstr1 = new String(arr1);
		String newstr2 = new String(arr2);
		if(newstr1.equals(newstr2))
		{
			return "Both Strings are Anagram";
		}
		else
		{
			return "Both Strings are not Anagram";
		}
	}

}
