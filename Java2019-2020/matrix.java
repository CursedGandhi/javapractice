import java.io.*;
import java.util.InputMismatchException;
public class matrix 
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int a[][];
    int m;
    matrix()
    {
        m=0;
    }
    void input()throws IOException
    {
        try
        {
            boolean s=false;
            do
            {
                System.out.println("M =");
                m=Integer.parseInt(in.readLine());
                if(m>10||m<2)
                {
                    System.out.println("INVALID INPUT");
                    s=true;
                }
                else
                s=false;
            }while(s);
            a=new int[m][m];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=Integer.parseInt(in.readLine());
                }
                System.out.println();
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
            input();
        }
    }
    void task1()
    {
        System.out.println("ORIGINAL MATRIX");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void task2()
    {
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    k++;
                    break;
                }
            }
            if(k>0)
            break;
        }
        if(k>0)
        System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
        else
        System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
    }
    void task3()
    {
        int g=0;
        int h=m-1;
        int sr=0;
        int sl=0;
        for(int i=0;i<m;i++)
        {
            sr=sr+a[i][h];
            sl=sl+a[i][g];
            g++;
            h--;
        }
        System.out.println("The sum of the left diagonal = "+sl);
        System.out.println("The sum of the right diagonal = "+sr);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        boolean s=false;
        do
        {
        matrix ob=new matrix();
        ob.input();
        ob.task1();
        ob.task2();
        ob.task3();
        System.out.println("Would you like to retry?y/n");
        char c=in.readLine().charAt(0);
        if(c=='y'||c=='Y')
        s=true;
        else
        s=false;
        }while(s);
    }
}
