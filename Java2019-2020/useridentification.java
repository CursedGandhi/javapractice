import java.io.*;
public class useridentification 
{
    int n;
    int ui[];
    int lih[];
    int loh[];
    int lim[];
    int lom[];
    int d[];
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    useridentification()
    {
        n=0;
    }
    void input()throws IOException
    {
        System.out.println("Number of users:");
        n=Integer.parseInt(in.readLine());
        ui=new int[n];
        lih=new int[n];
        loh=new int[n];
        lim=new int[n];
        lom=new int[n];
        d=new int[n];
        String s="";
        int j;
        for(int i=0;i<n;i++)
        {
            System.out.println("USER IDENTIFICATION");
            ui[i]=Integer.parseInt(in.readLine());
            System.out.println("LOGIN TIME");
            s=in.readLine();
            j=s.indexOf(":");
            lih[i]=Integer.parseInt(s.substring(0,j));
            lim[i]=Integer.parseInt(s.substring(j+1));
            System.out.println("LOGOUT TIME");
            s=in.readLine();
            j=s.indexOf(":");
            loh[i]=Integer.parseInt(s.substring(0,j));
            lom[i]=Integer.parseInt(s.substring(j+1));
        }
    }
    void duration()
    {
        int hours=0;
        int min=0;
        for(int i=0;i<n;i++)
        {
            if(lih[i]>12&&loh[i]<12)
            hours=(24-lih[i])+loh[i];
            else
            hours=loh[i]-lih[i];
            if(lim[i]>lom[i])
            min=(60-lim[i])+lom[i];
            else
            min=lom[i]-lim[i];
            d[i]=hours*60+min;
        }
    }
    void display()
    {
        System.out.println("USER IDENTIFICATION\tLOGIN TIME\tLOGOUT TIME\tDURATION");
        for(int i=0;i<n;i++)
        {
            System.out.println(ui[i]+"\t\t"+lih[i]+":"+lim[i]+"\t\t"+loh[i]+":"+lom[i]+"\t\t"+(d[i]/60)+":"+(d[i]%60));
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(d[i]>=d[max])
            {
                max=i;
            }
        }
        System.out.println("The user who logged in for longest duration:");
        System.out.println(ui[max]+"\t\t"+lih[max]+":"+lim[max]+"\t\t"+loh[max]+":"+lom[max]+"\t\t"+(d[max]/60)+":"+(d[max]%60));
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        boolean ch=true;
        char g;
        while(ch)
        {
            useridentification ob=new useridentification();
            ob.input();
            ob.duration();
            ob.display();
            System.out.println("Would you like to restart the program?y/n");
            g=in.readLine().charAt(0);
            if(g=='y'||g=='Y')
            ch=true;
            else
            ch=false;
        }
    }
}
