import java.util.*;
import java.io.*;
public class StringMani 
{
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    String str;
    int n;
    int w;
    StringMani()
    {
        str="";
        n=0;
        w=0;
    }
    void input()throws IOException
    {
        boolean s=false;
        do
        {
            System.out.println("Enter number of sentences:");
            n=Integer.parseInt(in.readLine());
            if(n<1||n>=4)
            {
                System.out.println("Invalid number of sentence");
                s=true;
                continue;
            }
            else
            s=false;
        }while(s);
        s=false;
        do
        {
            System.out.println("Enter sentences:");
            str=in.readLine();
            StringTokenizer st = new StringTokenizer(str, ".?");
            int k=0;
            while(st.hasMoreTokens())
            {
                st.nextToken();
                k++;
            }
            if(k!=n)
            {
                System.out.println("Invalid sentence");
                s=true;
                continue;
            }
            else
            {
            s=false;
            }
        }while(s);
    }
    void words()
    {
        String t;
        String s;
        StringTokenizer st = new StringTokenizer(str, " .?");
        int k=0;
        while(st.hasMoreTokens())
        {
            st.nextToken();
            k++;
        }
        System.out.println("Total number of words="+k);
        System.out.println("WORD\tFREQUENCY");
        st=new StringTokenizer(str, " .?");
        while(st.hasMoreTokens())
        {
            k=1;
            s=st.nextToken();
            StringTokenizer f = new StringTokenizer(str, " .?");
            while(f.hasMoreTokens())
            {
                String j=f.nextToken();
                if(j.trim()==s.trim())
                {
                    k++;
                    str.replace(j," ");
                }
            }
            System.out.println(s+"\t\t"+k);
        }
    }
    public static void main()throws IOException
    {
        StringMani ob=new StringMani();
        ob.input();
        ob.words();
    }
}
