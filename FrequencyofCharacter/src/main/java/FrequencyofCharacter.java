import java.util.Arrays;

public class FrequencyofCharacter {
    public static void isFrequency(String str)
    {
    	char arr[]=str.toCharArray();
    	Arrays.sort(arr);
    	String nstr=new String(arr);
    	int count=1;
    	for(int i=0;i<=nstr.length()-2;i++)
    	{
    		if(nstr.charAt(i)==nstr.charAt(i+1))
    		{
    			count++;
    		}
    		else
    		{
    			System.out.println("The frequency of "+nstr.charAt(i)+" is "+count);
    			count=1;
    		}
    	}
    	System.out.println("The frequency of "+nstr.charAt(nstr.length()-1)+" is "+count);
    	
    }
    
}
