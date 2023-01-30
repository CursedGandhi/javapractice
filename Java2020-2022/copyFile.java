import java.io.*;
public class copyFile {
    public static void main(String[] args)throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try
        {
            in = new FileInputStream("ABC.txt");
            out = new FileOutputStream("XYZ.txt");
            int c;
            out.write(56);
            while((c=in.read())!=-1)
            {
                out.write(c);
            }
        }
        catch(IOException e)
        {}
        finally
        {
            if(in!=null)
            in.close();
            if(out!=null)
            out.close();
        }
    }
}
