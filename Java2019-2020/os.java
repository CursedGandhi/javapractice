import java.io.*;
public class os 
{
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int n;
    String s;
    os()
    {
        n=0;
        s="";
    }
    void input()throws IOException
    {
        boolean ch;
        do
        {
        ch=false;
        System.out.print("N=");
        if(n>6)
        {
            System.out.println("Invalid ! Length has to be less than 6");
            ch=true;
            continue;
        }
        n=Integer.parseInt(in.readLine());
        s=in.readLine();
        if(s.length()==n)
        {
            int k=0;
            for(int i=0;i<n;i++)
            {
                char b=s.charAt(i);
                if(Character.isLowerCase(b))
                {
                    k++;
                    break;
                }
                else
                {
                    if(i<n-1)
                    if(b+1==s.charAt(i+1))
                    {
                        k++;
                        break;
                    }
                }
            }
            if(k!=0)
            {
                System.out.println("Invalid ! Only uppercase letters are permitted");
                ch=true;
                continue;
            }
        }
        else
        {
            System.out.println("Invalid ! Wrong length");
            ch=true;
            continue;
        }
        int k=0;
        for (int i=0;i<n-1;i++)
        {
            char b=s.charAt(i);
            if(s.charAt(i+1)==(char)(b+1))
            {
                k++;
                break;
            }
        }
        if(k!=0)
        {
            System.out.println("Invalid ! Only alternate letters permitted");
            ch=true;
            continue;
        }
        k=0;
        for(int i=0;i<n-1;i++)
        {
            char b=s.charAt(i);
            for(int j=i;i<n;i++)
            {
                char c=s.charAt(j);
                if(b==c)
                {
                    k++;
                    break;
                }
            }
            if(k!=0)
            {
                break;
            }
        }
        if(k!=0)
        {
            System.out.println("Invalid ! Repetition of letters is not permitted");
            ch=true;
            continue;
        }
        k=0;
        for(int i=0;i<n;i++)
        {
            char b=s.charAt(i);
            if(b!='A'&&b!='C'&&b!='E'&&b!='G'&&b!='I'&&b!='K')
            {
                k++;
                break;
            }
        }
        if(k!=0)
        {
            System.out.println("Invalid ! Wrong characters used");
            ch=true;
            continue;
        }
        }while(ch);
    }
}
