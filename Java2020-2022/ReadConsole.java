import java.io.*;
public class ReadConsole {
    public static void main(String[] args) throws IOException{
        InputStreamReader cin = new InputStreamReader(System.in);
        try
        {
        System.out.println("Enter q for quitting: ");
        int c;
        char x;
        do
        {
            c = (char)cin.read();
        }while(c!='q');
        }
        finally
        {
            if(cin!=null)
            {
                cin.close();
            }
        }      
    }
}
