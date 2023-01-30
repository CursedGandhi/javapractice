public class recursionfactorial {
    int factorial(int n)
    {
        if(n == 1)
            return(1);
        else
            return(n*factorial(--n));
    }
    public static void main(String[] args) {
        recursionfactorial ob = new recursionfactorial();
        System.out.println(ob.factorial(5));
    }
}
