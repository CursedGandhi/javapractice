import java.io.*;
public class Mixer 
{
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int arr[];
    int n;
    Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void accept()throws IOException
    {
        System.out.println("Enter array in ascending order");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(in.readLine());
        }
    }
    Mixer mix(Mixer A)
    {
        Mixer B = new Mixer (n+A.n);
        int x=0;
        int i=0;

        for(i=0;i<n;i++)
        {
            B.arr[x++]=arr[i];
        }
        for(i=0;i<A.n;i++)
        {
            B.arr[x++]=A.arr[i];
        }
        return(B);
    }
    void display()
    {
        System.out.println("Array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main()throws IOException
    {
        Mixer A = new Mixer (5);
        Mixer B = new Mixer (5);
        Mixer C = new Mixer (10);
        A.accept();
        B.accept();
        C=A.mix(B);
        C.display();
    }
}