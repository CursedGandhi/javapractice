import java.io.*;
public class CircularPrime
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int n;
    CircularPrime()
    {
        n=0;
    }
    void input()throws IOException
    {
        System.out.println("Enter a number");
        n=Integer.parseInt(in.readLine());

    }
    boolean prime(int a)
    {
        int k=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                k++;
                break;
            }
        }
        if(k>1)
        return true;
        else
        return false;

    }
    void check()
    {
        int t=n;
        int d;
        int k=0;
        int h=0;
        int i=0;
        if(prime(n))
        k++;
        while(t>0)
        {
            i++;
            t=t/10;
        }
        t=n;
        for(int j=1;j<i;j++)
        {
            while(t>0)
            {
                d=t%10;
                h=(d*10)+h;
                t=t/10;
            }
            if(prime(h))
            k++;
            t=h;
        }
        if(k==i)
        System.out.println(n+" is a circular prime");
        else
        System.out.println(n+" is not a circular prime");
    }
    public static void main(String args[])throws IOException
    {
        CircularPrime ob=new CircularPrime();
        ob.input();
        ob.check();
    }
}