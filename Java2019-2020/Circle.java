public class Circle implements Shape
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    public double area()
    {
        return(3.14*radius*radius);
    }
    public static void main()
    {
        Circle ob = new Circle(2.3);
        System.out.println("Area of circle+"+ob.area());
    }
}