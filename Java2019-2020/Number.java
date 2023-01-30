import java.io.IOException;

public class Number 
{
    protected int n;
    public Number(int nn)
    {
        n=nn;
    }
    public int factorial(int a)
    {
        int f=1;
        for(int i=a;i>=1;i--)
        {
            f=f*a;
        }
        return(f);
    }
    public void display()
    {
        System.out.println(n+":"+factorial(n));
    }    
}
class Series extends Number
{
    long sum;
    Series(int nn)
    {
        super(nn);
        sum=0;
    }
    void calsum()
    {
        for(int i=1;i<=n;i++)
        {
            sum=sum+factorial(i);
        }
    }
    public void display()
    {
        super.display();
        System.out.println("Sum of the series="+sum);
    }
    public static void main()throws IOException
    {
        Series ob = new Series(10);
        ob.calsum();
        ob.display();
    }
}