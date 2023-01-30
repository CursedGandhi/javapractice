
public class Diserium
{
    int num;
    int size;
    Diserium(int nn)
    {
        num=nn;
        size=0;
    }
    void countDigits()
    {
        int t=num;
        while(t>0)
        {
            t=t/10;
            size++;
        }
    }
    int sumofDigits(int n, int p)
    {
        if(n<10)
        return((int)Math.pow(n,p));
        else
        {
            int t=(int)(Math.pow(n%10,p));
            return (t+sumofDigits(n/10,--p));
        }
    }
    void check()
    {
        if(num==sumofDigits(num,size))
        System.out.println(num+" is a Diserium number");
        else
        {
            System.out.println(num+" is not a Diserium number");
        }
    }
    public static void main()
    {
        Diserium ob=new Diserium(135);
        ob.countDigits();
        ob.check();
    }
}