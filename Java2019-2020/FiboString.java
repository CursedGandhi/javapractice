import java.io.*;
public class FiboString
{
    String x;
    String y;
    String z;
    int n;
    FiboString()
    {
        x="a";
        y="b";
        z=y+x;
    }
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    void accept()throws IOException
    {
        System.out.println("Enter number of terms");
        n=Integer.parseInt(in.readLine());
    }
    void generate()
    {
        for(int i=0;i<n;i++)
        {
            z=y+x;
            x=y;
            y=z;
            System.out.print(z+" ");
        }
    }
    public static void main()throws IOException
    {
        FiboString ob=new FiboString();
        ob.accept();
        ob.generate();
    }
}