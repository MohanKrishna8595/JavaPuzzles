
public class NumberProgram4 {
public void isSumofSquare(int n)
{
    int Sumofsq=0;
    int Squareofsum=0;
    int diff=0;
    for(int i=1;i<=n;i++)
    {
    	Sumofsq=Sumofsq+(i*i);
    }
    for(int i=1;i<=n;i++)
    {
    	 Squareofsum=Squareofsum+i;
    }
    diff=(Squareofsum*Squareofsum)-Sumofsq;
    System.out.println(diff);


}
}
