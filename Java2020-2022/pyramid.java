public class pyramid {
    public static void main(String[] args) {
        int l=0;
        for(int i=1; i<=4; i++)
        {
            System.out.print("\t\t\t\t\t\t\t\t\t");
            for(int k = 4; k>=l; k--)
            {
                    System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print("* ");
            }
            l++;
            System.out.println();
        }
    }
}
