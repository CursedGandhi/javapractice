import java.io.*;
public class ReturnArray
{
    int[] check(int w[])
    {
        int i, j, t;
        for(i=0;i<w.length;i++)
        {
            for(j=0;j<(w.length-i-1);j++)
            {
                if(w[j]>w[j+1])
                {
                    t=w[j];
                    w[j]=w[j+1];
                    w[j+1]=t;
                }
            }
        }
        return w;
    }
    public void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int m[]=new int[5];
        int k[]=new int[5];
        System.out.println("Please enter the no.s to be sorted:");
        for(int i=0;i<5;i++)
        {
            m[i]=Integer.parseInt(in.readLine());
        }
        k=check(m);
        System.out.println("The sorted array is ");
        for(int i=0;i<5;i++)
        {
            System.out.println(m[i]+" ");
        }
    }
}