import java.io.*;
public class practical3 
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int n;
    int a[][];
    int m[];
    practical3()
    {
        n=0;
    }
    void input()throws IOException
    {
        boolean x;
        do
        {
            x=false;
            System.out.print("N=");
            n=Integer.parseInt(in.readLine());
            System.out.println();
            if(n<=20&&n>0)
            {
                a=new int[n][n];
                System.out.println("Matrix A[][]:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        a[i][j]=Integer.parseInt(in.readLine());
                    }
                    System.out.println();
                }
            }
            else
            {
                System.out.println("Invalid Input");
                x=true;
            }
        }while(x);
    }
    void show()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
    void symmetry()
    {
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==a[j][i])
                k++;
            }
        }
        if(k==n)
        {
            System.out.println("Matrix is symmetric");
        }
        else
        {
            System.out.println("Matrix is unsymmetric");
        }
    }
    boolean prime(int r)
    {
        int l=0;
        for(int i=2;i<r;i++)
        {
            if(r%i==0)
            {
                l++;
                break;
            }
        }
        if(l==0)
        return true;
        else
        return false;
    }
    boolean repeat(int h)
    {
        int k=0;
        for(int i=0;i<m.length;i++)
        {
            if(h==m[i])
            {
                k++;
                break;
            }
        }
        if(k>0)
        return true;
        else
        return false;
    }
    void primeCheck()
    {
        int y=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(prime(a[i][j]))
                k++;
            }
        }
        m=new int[k];
        for(int i=0;i<k;i++)
        m[i]=0;
        System.out.println("PRIME NO.\tROW\tCOLUMN");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(prime(a[i][j]))
                {
                    if(!repeat(a[i][j]))
                    {
                        System.out.println(a[i][j]+"\t"+i+"\t"+j);
                        m[y]=a[i][j];
                        y++;
                    }
                }
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        boolean x;
        do
        {
            char g;
            x=false;
            practical3 ob=new practical3();
            ob.input();
            ob.show();
            ob.symmetry();
            ob.primeCheck();
            System.out.println("Would you like to restart?y/n");
            g=in.readLine().toUpperCase().charAt(0);
            if(g=='Y')
            x=true;
        }while(x);
    }
}
