import java.util.Scanner;
public class input 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter float:");
        float x = in.nextFloat();
        System.out.println(x);
        System.out.println("Enter integer:");
        int a = in.nextInt();
        System.out.println(a);
        System.out.println("Enter double:");
        double b = in.nextDouble();
        System.out.println(b);
        System.out.println("Enter string");
        String c = in.next();
        System.out.println(c);
    }
}
