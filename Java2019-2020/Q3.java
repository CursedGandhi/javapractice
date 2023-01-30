import java.io.IOException;

import java.io.*;
public class Q3 {
    int day;
    int year;
    boolean lp;
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read); 
    Q3(){
        day=0;
        year=0;
        lp=false;
    }
    void input()throws IOException
    {
        int n=0;
        do{
        System.out.println("Enter day of year(1 to 366)");
        day=Integer.parseInt(in.readLine());
        System.out.println("Enter year between 1950 and 2008");
        year=Integer.parseInt(in.readLine());
        if(day<1||day>366||year<1950||year>2008)
        {
            n=1;
            System.out.println("Invalid Input");
        }
        if(year%4==0)
        {
            lp=true;
        }
        if(day==366&&!lp)
        {
            n=1;
            System.out.println("Invalid Input");
        }
        }while(n==1);
    }
    void display()
    {
        if(!lp)
        {
            if(day>=1&&day<=31)
            {
                System.out.println("January "+day+", "+year);
            }
            if(day>=32&&day<=49)
            {
                System.out.println("February "+(day-31)+", "+year);
            }
            if(day>=50&&day<=81)
            {
                System.out.println("March "+(day-49)+", "+year);
            }
            if(day>=82&&day<=113)
            {
                System.out.println("April "+(day-81)+", "+year);
            }
            if(day>=114&&day<=144)
            {
                System.out.println("May "+(day-113)+", "+year);
            }
            if(day>=145&&day<=176)
            {
                System.out.println("June "+(day-144)+", "+year);
            }
            if(day>=177&&day<=208)
            {
                System.out.println("July "+(day-176)+", "+year);
            }
            if(day>=209&&day<=239)
            {
                System.out.println("August "+(day-208)+", "+year);
            }
            if(day>=240&&day<=271)
            {
                System.out.println("September "+(day-239)+", "+year);
            }
            if(day>=272&&day<=302)
            {
                System.out.println("October "+(day-271)+", "+year);
            }
            if(day>=303&&day<=334)
            {
                System.out.println("November "+(day-301)+", "+year);
            }
            if(day>=334&&day<=365)
            {
                System.out.println("December "+(day-333)+", "+year);
            }
        }
        else
        {
            day=day-1;
            if(day>=1&&day<=31)
            {
                System.out.println("January "+(day+1)+", "+year);
            }
            if(day>=32&&day<=49)
            {
                System.out.println("February "+(day-31)+", "+year);
            }
            if(day>=50&&day<=81)
            {
                System.out.println("March "+(day-49)+", "+year);
            }
            if(day>=82&&day<=113)
            {
                System.out.println("April "+(day-81)+", "+year);
            }
            if(day>=114&&day<=144)
            {
                System.out.println("May "+(day-113)+", "+year);
            }
            if(day>=145&&day<=176)
            {
                System.out.println("June "+(day-144)+", "+year);
            }
            if(day>=177&&day<=208)
            {
                System.out.println("July "+(day-176)+", "+year);
            }
            if(day>=209&&day<=239)
            {
                System.out.println("August "+(day-208)+", "+year);
            }
            if(day>=240&&day<=271)
            {
                System.out.println("September "+(day-239)+", "+year);
            }
            if(day>=272&&day<=302)
            {
                System.out.println("October "+(day-271)+", "+year);
            }
            if(day>=303&&day<=334)
            {
                System.out.println("November "+(day-301)+", "+year);
            }
            if(day>=334&&day<=365)
            {
                System.out.println("December "+(day-333)+", "+year);
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        Q3 ob=new Q3();
        ob.input();
        ob.display();
    }
}