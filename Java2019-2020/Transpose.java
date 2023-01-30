import java.io.*;
public class Transpose 
{
    void transpose(int a[][])
    {
        int t;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
    }
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Transpose ob = new Transpose();
        int b[][]=new int [3][3];
        System.out.println("Enter 3x3 matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=Integer.parseInt(in.readLine());
            }
        }
        ob.transpose(b);
        System.out.println("Transpose of matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
