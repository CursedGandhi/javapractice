import java.io.*;
import java.util.*;
public class encryption
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    String s;
    int l;
    int r;
    encryption()
    {
        s="";
        l=0;
    }
    void input()throws IOException
    {
        boolean b=false;
        do
        {
            System.out.println("Coded Text:");
            s=in.readLine();
            s=s+" ";
            b=check();
            if(b)
            {
                System.out.println("Invalid Sentence");
                continue;
            }
            System.out.println("Shift:");
            r=Integer.parseInt(in.readLine());
            if(r<=1&&r>=26)
            {
                b=true;
                continue;
            }
            b=false;
        }while(b);
    }
    boolean check()
    {
        int k=0;
        StringTokenizer str=new StringTokenizer(s," ");
        while(str.hasMoreTokens())
        {
            k++;
            str.nextToken();
        }
        int g=0;
        str=new StringTokenizer(s," ");
        for(int i=0;i<k;i++)
        {
            if(i!=(k-1))
            {
                if((str.nextToken()).length()!=6)
                {
                    g++;
                    break;
                }
            }
        }
        if(g>0)
        return(true);
        else
        return(false);
    }
    void decode()
    {
        String t="";
        String j="";
        String f="";
        StringTokenizer str = new StringTokenizer(s," ");
        while(str.hasMoreTokens())
        {
            t="";
            j=str.nextToken();
            for(int i=0;i<j.length();i++)
            {
                char b=j.charAt(i);
                int c=(int)b+r;
                if(c>90)
                {
                    c=64+(c-91);
                    t=t+(char)c;
                }
                else
                t=t+(char)(c-1);
            }
            for(int i=0;i<t.length();i++)
            {
                char b=t.charAt(i);
                if(b=='Q')
                {
                    if(i<(t.length()-1))
                    {
                        if(t.charAt(i+1)=='Q')
                        {
                            f=f+" ";
                            i++;
                        }
                        else
                        f=f+b;
                    }
                    else
                    f=f+b;
                }
                else
                f=f+b;
            }
        }
        System.out.println("Decoded Text:"+f);
    }
    public static void main(String args[])throws IOException
    {
        boolean ch;
        do
        {
            ch=false;
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            encryption ob=new encryption();
            ob.input();
            ob.decode();
            System.out.println("Would you like to restart the program?y/n");
            if(in.readLine().toLowerCase().charAt(0)=='y')
            ch=true;
        }while(ch);
    }
}