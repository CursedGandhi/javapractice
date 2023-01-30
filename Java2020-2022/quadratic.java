import java.util.*;
public class quadratic {
    int a, b, c;
    double x1, x2, D;
    Scanner in = new Scanner(System.in);
    public static void RootOfNegetiveNumber()
    {
        ;
        throw new ArithmeticException("Trying to find root of negetive number");
    }
    public void input()
    {
        System.out.print("Enter a: ");
        a = in.nextInt();
        System.out.print("Enter b: ");
        b = in.nextInt();
        System.out.print("Enter c: ");
        c = in.nextInt();
    }
    void display()
    {
        System.out.println("x1 = "+ x1);
        System.out.println("x2 = "+ x2);
    }
    public static void main(String[] args) {
        quadratic ob = new quadratic();
        ob.input();
        try
        {
            if(Math.pow(ob.b, 2)- (4*ob.a*ob.c)<0)
                RootOfNegetiveNumber();
            else
                ob.D = Math.sqrt(Math.pow(ob.b, 2) - (4*ob.a*ob.c));
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.exit(0);
        }
        ob.x1 = (-ob.b + ob.D)/(2*ob.a);
        ob.x2 = (-ob.b - ob.D)/(2*ob.a);
        ob.display();
    }
}
