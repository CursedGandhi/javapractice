import java.io.*;

public class Employee 
{
    String name;
    int emp_no;
    double gross;
    double net;
    double pf;
    double hra;
    double da;
    double basic;
    Employee()
    {
        name="";
        emp_no=0;
        gross=0.0;
        net=0.0;
        pf=0.0;
        hra=0.0;
        da=0.0;
        basic=0.0;
    }
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    void input()throws IOException
    {
        System.out.println("Enter the name:");
        name=in.readLine();
        System.out.println("Enter the employee number:");
        emp_no=Integer.parseInt(in.readLine());
        System.out.println("Enter basic salary:");
        basic=Double.parseDouble(in.readLine());
    }
    void calculate()
    {
        hra=(35/100)*basic;
        da=(10.3/100)*basic;
        gross=basic+hra+da;
        pf=(33.33/100)*basic;
        net=gross-pf;
    }
    void display()
    {
        System.out.println("Name of employee:"+name);
        System.out.println("Employee Number:"+emp_no);
        System.out.println("Basic Salary:"+basic);
        System.out.println("Gross Salary:"+gross);
        System.out.println("Net Salary:"+net);
    }
    public static void main()throws IOException
    {
        Employee ar[]=new Employee[5];
        for(int i=0;i<5;i++)
        {
            ar[i]=new Employee();
            ar[i].input();
            ar[i].calculate();
            ar[i].display();
        }
    }
}
