import java.io.*;
public class wonderoussq
{
    int m[][];
    int n;
    wonderoussq()
    {
        n=0;
    }
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    void input()throws IOException
    {
        boolean ch=false;
        do
        {
            System.out.println("N=");
            n=Integer.parseInt(in.readLine());
            if(n<2||n<10)
            {
                ch=true;
                break;
            }
            else
            ch=false;
            m=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    m[i][j]=Integer.parseInt(in.readLine());
                }
            }
        }while(ch);
    }
    boolean check()
    {
        int x=0;
        int z=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                z=0;
                x=m[i][j];
                for(int k=0;k<n;k++)
                {
                    for(int l=0;l<n;l++)
                    {
                        if(m[k][l]==x)
                        z++;
                    }
                }
                if(z>1)
                {
                    break;
                }
            }
            if(z>0)
            {
                break;
            }
        }
        if(z>0)
        {
            return false;
        }
        z=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(m[i][j]<1||m[i][j]>(n*n))
                {
                    z++;
                    break;
                }
            }
            if(z>0)
            break;
        }
        if(z>0)
        {
            return false;
        }
        z=0;
        double s=0.5*n*((n*n)+1);
        for(int i=0;i<n;i++)
        {
            double sumr=0;
            double sumc=0;
            for(int j=0;j<n;j++)
            {
                sumr=sumr+m[i][j];
                sumc=sumc+m[j][i];
            }
            if(sumc!=s||sumr!=s)
            {
                z++;
                break;
            }
        }
        if(z>0)
        return false;
        return true;
    }
    void display()
    {
        if(check())
        {
            System.out.println("YES, IT REPRESENTS A WONDEROUS SQUARE");
        }
        else
        System.out.println("NO, IT DOES NOT REPRESENT A WONDEROUS SQUARE");
    }
    public static void main()throws IOException
    {
        wonderoussq ob=new wonderoussq();
        ob.input();
        ob.display();
    }
}