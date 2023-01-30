import java.io.*;
public class increasingdecreasing 
{
    int n[];
    int l;
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    void input()throws IOException
    {
        boolean ch=false;
        do
        {
            ch=false;
            System.out.print("N - ");
            l=Integer.parseInt(in.readLine());
            if(l>20)
            {
                System.out.println("Only 20 numbers are valid");
                ch=true;
                continue;
            }
            n=new int[l];
            System.out.println();
            System.out.println("Numbers");
            for(int i=0;i<l;i++)
            {
                n[i]=Integer.parseInt(in.readLine());
            }
        }while(ch);
    }
    void largest()
    {

    }
}
