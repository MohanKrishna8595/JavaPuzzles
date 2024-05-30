
public class CountVowels {
	public void isCount(String str)
	{
		String nstr =str.toLowerCase();
	    char arr[]=nstr.toCharArray();
	    int vowels=0;
	    int consonants=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o'||arr[i]=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("Vowels : "+vowels);
		System.out.println("Consonants : "+consonants);
	}

}
