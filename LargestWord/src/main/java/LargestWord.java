
public class LargestWord {
	public void isLargestWord(String str)
	{
		String arr[]=str.split(" ");
		String lar="";
		String nstr="";
		for(int i=0;i<=arr.length-1;i++)
		{
			nstr=nstr+arr[i]+"";
			if(nstr.length()>lar.length())
			{
				lar=nstr;
			}
			nstr="";
		}
		System.out.println("Largest word : "+lar);
	}

}
