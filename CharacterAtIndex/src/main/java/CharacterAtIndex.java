
public class CharacterAtIndex {
	public void isCharacter(String str,int index)
	{
		char ch=' ';
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(index==i)
			{
				ch=str.charAt(index);
			}
		}
		System.out.println("Character At Index :"+ch);
	}

}
