import java.io.*;
public class calculator {
    static double a;
    static double b;
    calculator()
    {
        a=0.0;
        b=0.0;
    }
    void add()
    {
        System.out.println(a+b);
    }
    void subtract()
    {
        System.out.println(a-b);
    }
    void multiply()
    {
        System.out.println(a*b);
    }
    void divide()
    {
        System.out.println(a/b);
    }
    public static void main(String args[])throws IOException
    {
        calculator ob=new calculator();
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter value for a");
        a=Double.parseDouble(in.readLine());
        System.out.println("Enter value for b");
        b=Double.parseDouble(in.readLine());
        ob.add();
        ob.subtract();
        ob.multiply();
        ob.divide();
    }
}
