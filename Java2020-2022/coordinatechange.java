//Suyash Rane
//21BCG10078
import java.io.*;
public class coordinatechange {
    int x;
    int y;
    void polar()
    {
        double r = Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
        double theta = Math.toDegrees(Math.atan((y/x)));
        System.out.println("In Polar Coordinates: ("+r+", "+theta+")");
    }
    public static void main(String[] args)throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        coordinatechange ob = new coordinatechange();
        System.out.println("Enter value for x: ");
        ob.x = Integer.parseInt(in.readLine());
        System.out.println("Enter value for y: ");
        ob.y = Integer.parseInt(in.readLine());
        ob.polar();
    }
}
