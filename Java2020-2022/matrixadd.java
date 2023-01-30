import java.util.*;
public class matrixadd {
    int a[][];
    int b[][];
    int c[][];
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows for matrix A: ");
        int n = in.nextInt();
        System.out.print("Enter number of columns for matrix A: ");
        int m = in.nextInt();
        a = new int[n][m];
        System.out.print("Enter number of rows for matrix B: ");
        int x = in.nextInt();
        System.out.print("Enter number of columns for matrix B: ");
        int y = in.nextInt();
        b = new int[x][y];
        int i, j;
        for(i = 0; i<n; i++)
        {
            for(j = 0; j<m; j++)
            {
                System.out.print("a["+i+"]["+j+"]: ");
                a[i][j] = in.nextInt();
            }
        }
        System.out.println();
        for(i = 0; i<x; i++)
        {
            for(j = 0; j<y; j++)
            {
                System.out.print("b["+i+"]["+j+"]: ");
                b[i][j] = in.nextInt();
            }
        }
        int g = x>=n?x:n;
        int h = y>=m?y:m;
        c = new int[g][h];
    }
    void add()
    {
        int i = 0;
        int j = 0;
        for(i = 0; i<c.length; i++)
        {
            for(j = 0; j<c[0].length; j++)
            {
                if(i<a.length&&j<a[0].length&&i<b.length&&j<b[0].length)
                {
                    c[i][j] = a[i][j]+b[i][j];
                }
                else if(i<a.length&&j<a[0].length)
                {
                    c[i][j] = a[i][j];
                }
                else if(i<b.length&&j<b[0].length)
                {
                    c[i][j] = b[i][j];
                }
                else
                {
                    c[i][j] = 0;
                }
            }
        }
    }
    void print()
    {
        int i=0;
        int j=0;
        for(i = 0; i<c.length; i++)
        {
            for(j = 0; j<c[0].length;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        matrixadd ob = new matrixadd();
        ob.input();
        ob.add();
        ob.print();
    }
}
