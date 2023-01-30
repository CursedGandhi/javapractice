//program runs till negative integer is entered and displays sum of all positive integers entered before
import java.util.Scanner;
class whileloop
{
    public static void main(String args[])
    {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        while(n>=0)
        {
            sum+=n;
            System.out.print("Enter a number:");
            n = in.nextInt();
        }
        System.out.println("Sum = "+sum);
        in.close();
    }
}