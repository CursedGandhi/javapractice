import java.io.*;
public class practical2 
{
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int N;
    String b;
    String a[];
    int j;
    practical2()
    {
        b="";
        N=0;
        j=0;
    }
    void input()throws IOException
    {
        boolean t=false;
        do
        {
            System.out.print("N=");
            N=Integer.parseInt(in.readLine());
            b=in.readLine();
            int k=0;
            for(int i=0;i<b.length();i++)
            {
                char c=b.charAt(i);
                if(c=='.')
                k++;
            }
            System.out.println(k);
            if(N!=k)
            {
                System.out.println("Invalid Input");
                t=true;
            }
        }while(t==true);
    }
    void array()
    {
        for(int i=0;i<b.length();i++)
        {
            char c=b.charAt(i);
            if(c=='\''||c==' '||c==','||c==';'||c==':'||c=='.')
            j++;
        }
        a=new String[j];
    }
    void emptyarray()
    {
        for(int i=0;i<j;i++)
        {
            a[i]="";
        }
    }
    void fillarray()
    {
        int r=0;
        int u=0;
        for(r=0;r<j;r++)
        {
            for(int i=u;i<b.length();i++)
            {
            char c=b.charAt(i);
            if(c=='\''||c==' '||c==','||c==';'||c==':'||c=='.')
            {
                u=i+1;
                break;
            }
            else
                a[r]=a[r]+c;
            }
        }
    }
    void display()
    {
        System.out.println("Output");
        for(int i=j-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])throws IOException
    {
        boolean t=false;
        do
        {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        practical2 ob = new practical2();
        ob.input();
        ob.array();
        ob.emptyarray();
        ob.fillarray();
        ob.display();
        System.out.println("Would you like to restart program?y/n");
        char y=in.readLine().charAt(0);
        if(y=='y')
        t=true;
        }while(t==true);
    }
}
