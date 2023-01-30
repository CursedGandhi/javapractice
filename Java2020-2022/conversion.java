import java.util.*;
import java.io.*;
public class conversion
{
    Scanner in = new Scanner(System.in);
    String deno[] = {"milli", "centi", "deci", "", "deka", "hecto", "kilo"};
    double val[] = {0.001, 0.01, 0.1, 1, 10, 100, 1000};
    double v;
    String unit;
    String den;
    String toden;
    String tounit;
    void input()
    {
        System.out.print("Enter value to be converted: ");
        v = in.nextDouble();
        System.out.print("Enter unit of value: ");
        in.nextLine();
        unit = in.nextLine();
        System.out.print("Enter unit to be converted to: ");
        tounit = in.nextLine();
    }
    String denomination(String s)
    {
        String d = "";
        int i = 0;
        while(true)
        {
            String l = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i+1));
            l = l.trim();
            if(l.equalsIgnoreCase("me"))
            {
                break;
            }
            d = d + Character.toString(s.charAt(i));
            i++;
        }
        d.trim();
        return(d);
    }
    void convert(String a, String b)
    {
        double x = 1.0;
        double y = 1.0;
        double change;
        for(int i = 0; i<deno.length; i++)
        {
            if(a.equalsIgnoreCase(deno[i]))
            {
                x = val[i];
            }
            if(b.equalsIgnoreCase(deno[i]))
            {
                y = val[i];
            }
        }
        change = x/y;
        System.out.println(x + " " +y);
        System.out.println(change);
        v = v * change;
    }
    void display()
    {
        System.out.println("Converted Value = "+ v + " " + tounit);
    }
    public static void main(String[] args) 
    {
        conversion ob = new conversion();
        ob.input();
        ob.den = ob.denomination(ob.unit);
        ob.toden = ob.denomination(ob.tounit);
        ob.convert(ob.den, ob.toden);
        ob.display();
    }
}