import java.io.*;
public class Sentence 
{
    String s;
    int l;
    int n;
    Sentence()
    {
        s="";
        l=0;
        n=0;
    }
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    void input()throws IOException
    {
        int k=0;
        do
        {
            System.out.println("Enter sentence");
            s=in.readLine();
            k=0;
            l=s.length();
            for(int i=0;i<l;i++)
            {
                char b=s.charAt(i);
                if(b=='.'||b==','||b=='!'||b=='?')
                {
                    k++;
                    break;
                }
            }
            if(k==0)
            {
                System.out.println("Invalid Input");
            }
        }while(k==0);
    }
    void perform()
    {
        s=s.toUpperCase();
        s=s+" ";
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            n++;
        }
        String a[]=new String[n];
        int k=0;
        for(int i=0;i<l;i++)
        {
            char b=s.charAt(i);
            if(b==' ')
            {
                k++;
            }
            else
            {
                a[k]=a[k]+b;
            }
        }
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j].charAt(0)<a[min].charAt(0))
                {
                    min=j;
                    String t=a[min];
                    a[min]=a[i];
                    a[i]=t;
                }
            }
        }
        System.out.println("length="+n);
        System.out.println("Rearranged Sentence=");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    public static void main()throws IOException
    {
        Sentence ob = new Sentence();
        ob.input();
        ob.perform();
    }
}