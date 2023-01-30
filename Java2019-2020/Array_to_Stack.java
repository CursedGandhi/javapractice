import java.io.*;
public class Array_to_Stack 
{
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int m[];
    int st[];
    int cap;
    int top;
    private String popmarks;
    Array_to_Stack(int a)
    {
        cap=a;
        m=new int[cap];
        st=new int[cap];
        for(int i=0;i<cap;i++)
        {
            st[i]=0;
        }
        top=-1;
    }
    void inputmarks()throws IOException
    {
        System.out.println("Enter marks in ascending order:");
        for(int i=0;i<cap;i++)
        {
            m[i]=Integer.parseInt(in.readLine());
            pushmarks(i);
        }
    }
    void pushmarks(int v)
    {
        if(top==(cap-1))
        {
            System.out.println("Not possible");
        }
        else
        {
            top++;
            st[top]=v;
        }
    }
    int popmarks()
    {
        if(top==-1)
        {
            return(-999);
        }
        else
        {
            top--;
            return(st[top]);
        }
    }
    void display()
    {
        for(int i=0;i<cap;i++)
        System.out.println(st[i]);
    }
    public static void main()throws IOException
    {
        Array_to_Stack ob = new Array_to_Stack(50);
        ob.inputmarks();
        System.out.println("Popped marks="+ob.popmarks);
        ob.display();
    }
}