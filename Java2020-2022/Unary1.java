public class Unary1 
{
    public static void main(String args[])
    {
        int a = 16, b = 32;
        int result1, result2, result3;
        System.out.println("Value of a: " +a);
        result1 = ~a+1;//negation +1 will give negative of given number(basically adding 1 to the sign binary digit of the number)
        System.out.println("After negation: " + result1);
        System.out.println("Value of b: " +b);
        result2 = b<<1;//shifts bits to the left
        System.out.println("After shift: " + result2);
        result3 =  b>>2;//shifts bits to the right
        System.out.println("After shift 2: "+result3);
    }
}
