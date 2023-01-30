import java.util.Scanner;
public class primecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = in.nextInt();
        int k = 0;
        for(int i = 2; i<n; i++)
        {
            if(n%i==0)
            {
                k++;
                break;
            }
        }
        if(k>0)
        {
            System.out.println("Not prime");
        }
        else
            System.out.println("Prime");
    }
    
}
