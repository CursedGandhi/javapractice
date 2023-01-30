import java.util.*;
public class ReadConsoleScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter q to quit: ");
        char c;
        do
        {
            c = in.nextLine().charAt(0);
        }while(c!='q');
    }
}
