public class Student 
{
    protected String name;
    public int rno;
    Student()
    {
        name="xyz";
        rno=1;
    }
    void display()
    {
        System.out.println("Roll No.:"+rno);
        System.out.println("Name:"+name);
    }
}
class ISC extends Student
{
    String option;
    public ISC()
    {
        option="Comp Sc";
    }
    void display()
    {
        System.out.println("Option:"+option);
        super.display();
    }
    static void main()
    {
        ISC i=new ISC();
        i.display();
        System.out.println(i.name);
        System.out.println(i.rno);
    }
}
