import java.io.*;
public class FileCopyChar {
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("AB.txt");
            out = new FileWriter("XY.txt");
            int i;
            while((i = in.read())!=-1)
            {
                out.write(i);
            }
        }
        finally
        {
            if(in!=null)
            {
                in.close();
            }
            if(out!=null)
            {
                out.close();
            }
        }
        
    }
}
