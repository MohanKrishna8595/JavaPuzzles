
public class RhombusPattern {
    public void isRPattern(int n)
    {
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=1;j<=n;j++)
    		{
    			System.out.print("*"+" ");
    		}
    	    
    		System.out.println();
    	}
    }
}
