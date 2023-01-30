public class Precedence 
{
    public static void main(String[] args) {
        int a = 10, b = 5, c = 1, result;
        result = a-c++-b++;
        System.out.println(result);
        a = 10; b = 5; c = 1;
        result = a-++c-++b;
        System.out.println(result);

        int x = 10;
        System.out.println(x++*++x);
        x = 10;
        System.out.println(++x*++x);
        x = 10;
        System.out.println(++x*x++);
    }    
}
