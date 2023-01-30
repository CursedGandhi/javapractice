import java.io.IOException;

public class Wages extends Worker
{
    int hrs;
    double rate;
    double wage;
    public Wages(String a, double b, int c, double d)
    {
        super(a, b);
        hrs=c;
        rate=d;
        wage=0.0;
    }
    double overtime()
    {
        return(rate*hrs);
    }
    public void display()
    {
        double x= overtime();
        wage= x+super.Basic;
        super.display();
        System.out.println("Wage="+wage);
    }
    public static void main()
    {
        Wages ob = new Wages("xyz", 10000, 8, 55);
        ob.display();
    }
}
class Worker 
{
    protected String Name;
    protected double Basic;
    public Worker (String a, double b)
    {
        Name = a;
        Basic = b;
    }
    void display()
    {
        System.out.println("Worker's name:"+Name);
        System.out.println("Basic pay:"+Basic);
    }
}

