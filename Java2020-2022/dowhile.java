import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        Scanner in = new Scanner(System.in);
        do
        {
            sum += n;
            System.out.print("Enter a number:");
            n = in.nextInt();
        }while(n>=0);
        System.out.println("Sum = "+sum);
        in.close();
    }
}
