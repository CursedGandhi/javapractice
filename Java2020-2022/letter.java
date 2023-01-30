import java.util.Scanner;
public class letter 
{
    public static void main(String[] args) {
        char c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        c = in.nextLine().toLowerCase().charAt(0);
        switch(c)
        {
            case 'a': case 'e':case 'i': case 'o': case 'u':
            System.out.println(c + " is a vowel");
            break;
            default:
            System.out.println(c + " is a consonent");
        }
    }
}
