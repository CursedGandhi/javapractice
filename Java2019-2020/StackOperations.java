import java.io.*;
public class StackOperations 
{
    int s[];
    int sp, n;
    StackOperations(int nn)
    {
        n=nn;
        s=new int[n];
        for(int i=0;i<n;i++)
        {
            s[i]=0;
            sp=-1;
        }
    }
    void pushData(int item)
    {
        if(sp==(n-1))
        {
                System.out.println("Stack Overflow");
        }
        else
        {
            sp++;
            s[sp]=item;
        }
    }
    void popData()
    {
        int value = 0;
        if(sp==-1)
        System.out.println("Stack Underflow Error");
        else
        {
            value=s[sp];
            System.out.println("The popped elements"+value);
            sp--;
        }
    }
    void display()
    {
        if(sp==-1)
        {
            System.out.println("Stack Empty");
        }
        else
        {
            for(int i=sp;i>=0;i--)
            System.out.println(s[i]);
        }
    }
    public static void main()throws IOException
    {
        StackOperations st = new StackOperations(5);
        st.pushData(1);
        st.pushData(2);
        st.pushData(3);
        st.pushData(4);
        st.pushData(5);
        st.pushData(6);
        st.display();
        st.popData();
        st.popData();
        st.popData();
        st.popData();
        st.popData();
        st.popData();
        st.display();
    }
}