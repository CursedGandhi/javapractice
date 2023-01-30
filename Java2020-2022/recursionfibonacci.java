public class recursionfibonacci {
    int fibonacci(int x, int y, int i)
    {
        int sum = x + y;
        if(i == 3)
            return(sum);
        System.out.println(sum);
        return(fibonacci(y, sum, --i));
    }
    public static void main(String[] args) {
        recursionfibonacci ob = new recursionfibonacci();
        System.out.println(ob.fibonacci(0, 1, 10));
    }
}
