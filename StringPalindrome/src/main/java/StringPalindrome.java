
public class StringPalindrome 
{
	public void isStringPalindrome(String str)
	{
		
		char arr[]=str.toCharArray();
		char revarr[]= new char[arr.length];
		int j=arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			revarr[j]=arr[i];
			j--;
		}
		String revstr = new String(revarr);
		if(str.equals(revstr))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
