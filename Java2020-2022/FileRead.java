import java.io.*;
public class FileRead {
    public static void main(String[] args)throws IOException {
        //FileReader r = null;
        FileReader r = new FileReader("Text.txt");
        try
        {
            int n;
            while((n = r.read())!=-1)
            {
                System.out.print((char)n);
            }
        }
        finally
        {
            if(r!=null)
            {
                r.close();
            }
        }
    }
}
