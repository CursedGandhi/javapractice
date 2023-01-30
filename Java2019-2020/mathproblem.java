import java.io.*;
public class mathproblem 
{
    int n;
    int a=0;
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    void input()throws IOException
    {
        System.out.println("Please enter a number");
        n=Integer.parseInt(in.readLine());
    }
    void check()
    {
        a++;
        System.out.println(n);
        if(n==1)
        terminate();
        else if(n%2==0)
        even();
        else
        odd();
    }
    void even()
    {
        n=n/2;
        check();
    }
    void odd()
    {
        n=3*n+1;
        check();
    }
    void terminate()
    {
        System.out.println("Iteratons="+a);
    }
    public static void main(String args[])throws IOException
    {
        mathproblem ob = new mathproblem();
        ob.input();
        ob.check();
    }
}
