public class func_overloading {
    public static double area(double a)
    {
        return(a*a);
    }
    public static double area(double a, double b)
    {
        return(a*b);
    }
    public static double area(double a, double b, double c)
    {
        double s = (a+b+c)/2;
        return(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    public static void main(String[] args) {
        System.out.println("Area of square: "+area(5));
        System.out.println("Area of rectangle: "+area(5, 6));
        System.out.println("Area of triangle: "+area(5, 6, 7));
    }
}
