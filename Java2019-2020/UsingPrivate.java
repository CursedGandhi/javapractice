public class UsingPrivate 
{
    private int x, y, z;
    void getvalue()
    {
        x=5;
        y=10;
    }
    private void add()
    {
        getvalue();
        z=x+y;
    }    
    void display()
    {
        add();
        System.out.println(z);
    }
    public static void main(String args[])
    {
        UsingPrivate ob=new UsingPrivate();
        ob.getvalue();
        ob.add();
        ob.display();
    }
}
