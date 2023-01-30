import java.io.*;
public class Record 
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    protected String name[] = new String[50];
    protected int rnk[] = new int[50];
    public Record()
    {
        for(int i=0;i<50;i++)
        {
            rnk[i]=0;
            name[i]=null;
        }
    }
    public void readValues()throws IOException
    {
        System.out.println("Enter names and ranks");
        for(int i=0;i<50;i++)
        {
            name[i]=in.readLine();
            rnk[i]=Integer.parseInt(in.readLine());
        }
    }
    public void display()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println(name[i]+","+rnk[i]);
        }
    }
}
class Rank extends Record
{
    int index;
    Rank()
    {
        super();
        index=0;
    }
    public void highest()
    {
        for(int i=0;i<50;i++)
        {
            if(super.rnk[index]>super.rnk[i])
            {
                index=i;
            }
        }
    }
    public void display()
    {
        super.display();
        System.out.println("Topmost rank "+super.rnk[index]+":"+super.name[index]);
    }
    public static void main()
    {
        Rank ob=new Rank();
        ob.display();
    }
}