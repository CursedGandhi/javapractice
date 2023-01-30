import java.util.*;
import java.time.*;
public class dateandtime
{
    public static void main(String args[])
    {
        LocalDate ob = LocalDate.now();
        System.out.println(ob);
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
    }
}