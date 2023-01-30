import java.io.*;
public class Matrix1 
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int arr[][];
    int m;
    int n;
    Matrix1(int mm, int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray()throws IOException
    {
        int i=0;
        System.out.println("Enter values in matrix:");
        for(i=0;i<m;i++);
        {
            for(int j=0;j<n;j++)
            arr[i][j]=Integer.parseInt(in.readLine());
        }
    }
    void display()
    {
        System.out.println("Matrix=");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    Matrix1 SubMat(Matrix1 A)
    {
        Matrix1 B=new Matrix1(m, n);
        B.display();
        A.display();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                B.arr[i][j]=A.arr[i][j]-B.arr[i][j];
            }
        }
        return(B);
    }
    public static void main()throws IOException
    {
        Matrix1 A = new Matrix1(3, 3);
        Matrix1 B = new Matrix1(3, 3);
        Matrix1 C = new Matrix1(3, 3);
        A.fillarray();
        B.fillarray();
        C=A.SubMat(B);
        C.display();
    }
}