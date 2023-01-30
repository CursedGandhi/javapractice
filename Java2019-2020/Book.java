import java.io.*;
public class Book
{
    String names[];
    int max;
    int point;
    Book(int cap)
    {
        max=cap;
        point=-1;
        names=new String[max];
        for(int i=0;i<max;i++)
        {
            names[i]="";
        }
    }
    void tell()
    {
        System.out.println("Book entered last:");
        if(point==-1)
        {
            System.out.println(names[point]);
        }
        else
        System.out.println(names[point]);
    }
    void add(String v)
    {
        if(point==(max-1))
        {
            System.out.println("SHELF FULL");
        }
        else
        {
            point++;
            names[point]=v;
        }
    }
    void display()
    {
        System.out.println("Books in the shelf:");
        if(point==-1)
        {
            System.out.println("SHELF EMPTY");
        }
        else
        {
            for(int i=point;i>=0;i++)
            System.out.println(names[i]);
        }
    }
    public static void main()
    {
        Book ob=new Book(5);
        ob.add("20,000 LEAGUES UNDER THE SEA");
        ob.add("AROUND THE WORLD IN 80 DAYS");
        ob.tell();
        ob.display();
    }
}