import java.io.*;
public class hello {
    public static void main(String[] args)throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a; 
        int b; 
        System.out.println("Enter value of a");
        a = Integer.parseInt(in.readLine());
        System.out.println("Enter value of b");
        b = Integer.parseInt(in.readLine());
        int c = a + b;
        System.out.println(c);
        String x = Integer.toString(c);
    }
}
