public class break2 {
    public static void main(String[] args) {
        int a[] = {3, 4, 5, 6, 7};
        int b[] = {1, 2, 8, 9, 10};
        int x=0, y=0;
        label:
        for (int i: a)
        {
            for(int j: b)
            {
                if(i==j)
                {
                    System.out.println("FOUND");
                    break label;
                }
                y = j;
            }
            x = i;
        }
        if(x!=y)
            System.out.println("NOT FOUND");
    }
}
