import java.util.*;
public class positivecheck 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter a number: ");
        n = in.nextInt();
        if(n>0)
        {
            System.out.println(n + " is  positive");
        }
        else if(n<0)
        {
            System.out.println(n + " is negative");
        }
        else
        {
            System.out.println(n + " is 0");
        }
    }    
}
