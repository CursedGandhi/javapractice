import java.io.IOException;
import java.io.*;
public class money
{
    int n;
    int arr[];
    money()
    {
        arr=new int[4];
        n=0;
    }
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    void input()throws IOException
    {
        System.out.println("Enter amount");
        n=Integer.parseInt(in.readLine());
    }
    void split()
    {
        int t=n;
        int d=0;int k=0;
        while(t>0)
        {
            d=t%10;
            t=t/10;
            arr[k]=d;
            k++;
        }
    }
    void display()
    {
        System.out.println("1000 x "+arr[3]+" = "+(1000*arr[3]));
        if(arr[2]>=5)
        {
            arr[2]=arr[2]-5;
            System.out.println("500 x "+1+" = "+(500*1));
        }
        else
        {
            System.out.println("500 x "+0+" = "+(500*0));
        }
        System.out.println("100 x "+arr[2]+" = "+(100*arr[2]));
        if(arr[1]>=5)
        {
            arr[1]=arr[1]-5;
            System.out.println("50 x "+1+" = "+(50*1));
        }
        else
        {
            System.out.println("50 x "+0+" = "+(50*0));
        }
        System.out.println("20 x "+(arr[1]/2)+" = "+(20*(arr[1]/2)));
        System.out.println("10 x "+(arr[1]%2)+" = "+(10*(arr[1]%2)));
        if(arr[0]>=5)
        {
            arr[0]=arr[0]-5;
            System.out.println("5 x "+1+" = "+(5*1));
        }
        else
        {
            System.out.println("5 x "+0+" = "+(5*0));
        }
        System.out.println("2 x "+(arr[0]/2)+" = "+(2*(arr[0]/2)));
        System.out.println("1 x "+(arr[0]%2)+" = "+(1*(arr[0]%2)));
    }
    public static void main()throws IOException
    {
        money ob=new money();
        ob.input();
        ob.split();
        ob.display();
    }
}