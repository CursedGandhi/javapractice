import java.io.*;
public class InputToFile {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        FileReader r = null;
        FileWriter w = new FileWriter("Text.txt");
        try
        {
            System.out.println("Enter text: ");
            String s = in.readLine();
            w.write(s);
            w.close();
            int c;
            r = new FileReader("Text.txt");
            System.out.println("Text Entered: ");
            while((c = r.read())!=-1)
            {
                System.out.print((char)c);
            }
        }
        finally
        {
            if(r!=null)
            {
                r.close();
            }
            if(w!=null)
            {
                w.close();
            }
        }
    }
}  
