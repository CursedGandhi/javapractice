public class leap 
{
    public static void main(String[] args) 
    {
        int year = 1900;
        String result = year%100==0?(year%400==0?"Leap Year":"Not Leap Year"):(year%4==0?"Leap Year":"Not Leap Year");
        System.out.println(result);
    }    
}
