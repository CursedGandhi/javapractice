import java.util.Scanner;
public class grade 
{
    public static void main(String[] args) 
    {
        double avg = 0;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<5; i++)
        {
            System.out.print("Enter "+(i+1)+" subject marks");
            avg = avg + in.nextInt();
        }
        avg = avg/5;
        System.out.println(avg);
        if(avg>=80)
            System.out.println("A grade");
        else if(avg>=65&&avg<80)
            System.out.println("B grade");
        else if(avg>=50&&avg<65)
            System.out.println("C grade");
        else if(avg>=40&&avg<50)
            System.out.println("D grade");
        else
            System.out.println("F grade");
        
    }
}
