import java.io.*;
public class date
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    String n;
    int d;
    int m; 
    int y;
    date()
    {
        n="";
        d=0;
        m=0;
        y=0;
    }
    void input()throws IOException
    {
        boolean a=false;
        do
        {
        System.out.println("Enter date in 6 digit format");
        n=in.readLine();
        if(n.length()!=8)
        {
            a=true;
            System.out.println("Invalid Input");
        }
        }while(a);
    }
    void seperate()
    {
        for(int i=0;i<n.length();i++)
        {
            d=Integer.parseInt(n.substring(0,2));
            m=Integer.parseInt(n.substring(2,4));
            y=Integer.parseInt(n.substring(4,8));
        }
    }
    void check()throws IOException
    {
        if(m>12)
        {
            System.out.println("Invalid Input");
            input();
        }
        if(d>31)
        {
            System.out.println("Invalid Input");
            input();
        }
        else
        {
            if(m%2==0&&d>30)
            {
                System.out.println("Invalid Input");
                input();
            }
        }
        if(m==2&&d>28)
        {
            System.out.println("Invalid Input");
            input();
        }
        if(m==2&&d==28&&y%4!=0)
        {
            System.out.println("Invalid Input");
            input();
        }

    }
    void show1()
    {
        if(d<10&&m>=10)
        System.out.println("0"+d+"/"+m+"/"+y);
        else if(m<10&&d>=10)
        System.out.println(d+"/0"+m+"/"+y);
        else if(m<10&&d<10)
        System.out.println("0"+d+"/0"+m+"/"+y);
        else
        System.out.println(d+"/"+m+"/"+y);
    }
    void show2()
    {
        switch(m)
        {
            case 1:
            System.out.println(d+" January, "+y);
            break;
            case 2:
            System.out.println(d+" February, "+y);
            break;
            case 3:
            System.out.println(d+" March, "+y);
            break;
            case 4:
            System.out.println(d+" April, "+y);
            break;
            case 5:
            System.out.println(d+" May, "+y);
            break;
            case 6:
            System.out.println(d+" June, "+y);
            break;
            case 7:
            System.out.println(d+" July, "+y);
            break;
            case 8:
            System.out.println(d+" August, "+y);
            break;
            case 9:
            System.out.println(d+" September, "+y);
            break;
            case 10:
            System.out.println(d+" October, "+y);
            break;
            case 11:
            System.out.println(d+" November, "+y);
            break;
            case 12:
            System.out.println(d+" December, "+y);
            break;
            default:
        }
    }
    public static void main(String args[])throws IOException
    {
        date ob=new date();
        ob.input();
        ob.seperate();
        ob.show1();
        ob.show2();
    }
}