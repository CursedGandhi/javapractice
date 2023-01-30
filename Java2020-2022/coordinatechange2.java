import java.io.*;
//Suyash Rane
//21BCG10078
public class coordinatechange2 {
    int x;
    int y;
    int z;
    void cylindrical()
    {
        double r = Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
        double theta = Math.toDegrees((Math.atan((y/x))));
        int z = this.z;
        System.out.println("In Cylindrical Coordinates: ("+r+", "+theta+", "+z+")");
    }
    public static void main(String[] args)throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        coordinatechange2 ob = new coordinatechange2();
        System.out.println("Enter value for x: ");
        ob.x = Integer.parseInt(in.readLine());
        System.out.println("Enter value for y: ");
        ob.y = Integer.parseInt(in.readLine());
        System.out.println("Enter value for z: ");
        ob.z = Integer.parseInt(in.readLine());
        ob.cylindrical();
    }
}
