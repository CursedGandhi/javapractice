import java.util.*;
public class thiskeyword {
    int x;
    thiskeyword(int x)
    {
        this.x = x;
    }
    void op()
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        thiskeyword ob = new thiskeyword(a);
        
    }
}
