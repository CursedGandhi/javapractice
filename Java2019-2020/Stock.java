import java.io.*;
public class Stock
{
    String item;
    int qty;
    double rate;
    double amt;
    Stock(String a, int b, double c, double d)
    {
        item=a;
        qty=b;
        rate=c;
        amt=d;
    }
    void display()
    {
        System.out.println("Name of item:"+item);
        System.out.println("Quantity of item:"+qty);
        System.out.println("Unit Price:"+rate);
        System.out.println("Net Value:"+amt);
    }
}
class Purchase extends Stock
{
    int pqty;
    double prate;
    Purchase(String a, int b, double c, double d, int e, double f)
    {
        super(a, b, c, d);
        pqty=e;
        prate=f;
    }
    void update()
    {
        qty=qty-pqty;
        rate=prate;
        amt=rate*qty;
    }
    void display()
    {
        super.display();
    }
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String z;
        int y;
        double x;
        double w;
        System.out.println("Enter name of item:");
        z=in.readLine();
        System.out.println("Enter quantity:");
        y=Integer.parseInt(in.readLine());
        System.out.println("Enter Unit Price");
        x=Double.parseDouble(in.readLine());
        w=x*y;
        int m;
        double n;
        System.out.println("Enter number of purchased items:");
        m=Integer.parseInt(in.readLine());
        System.out.println("Enter purchase quantity:");
        n=Double.parseDouble(in.readLine());
        Purchase ob=new Purchase(z, y, x, w, m, n);
        ob.update();
        ob.display();
    }
}