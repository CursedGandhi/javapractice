public class Rectangle implements Shape
{
    double le;
    double br;
    Rectangle(double l, double b)
    {
        le=l;
        br=b;
    }
    public double area()
    {
        return(le*br);
    }
    public static void main()
    {
        Rectangle ob = new Rectangle(1.2, 2.4);
        System.out.println("Area of rectangle="+ob.area());
    }
}
