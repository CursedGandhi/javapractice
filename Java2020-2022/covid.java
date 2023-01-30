public class covid {
    int x[][]=new int[10][10];
    covid()
    {
        for(int i=0; i<10 ; i++)
        {
            for(int j = 0; j<10; j++)
                x[i][j]=0;
        }
    }
    
    boolean check(int a, int b)
    {
        if(a == 0 && b != 0 && b!=x[a].length-1)
            if(x[a+1][b]==0&&x[a][b+1]==0&&x[a][b-1]==0&&x[a+1][b+1]==0&&x[a+1][b-1]==0)
                return true;
        if(b == 0 && a!=0 && a !=x.length-1)
            if(x[a+1][b]==0&&x[a][b+1]==0&&x[a-1][b]==0&&x[a+1][b+1]==0&&x[a-1][b+1]==0)
                return true;
        if(a == x.length-1 && b!=0 && b!=x[a].length-1)
            if(x[a][b+1]==0&&x[a-1][b]==0&&x[a][b-1]==0&&x[a-1][b+1]==0&&x[a-1][b-1]==0)
                return true;
        if(b == x[a].length-1 && a!=0 && a!=x.length-1)
            if(x[a+1][b]==0&&x[a-1][b]==0&&x[a][b-1]==0&&x[a-1][b-1]==0&&x[a+1][b-1]==0)
                return true;
        if(a == 0 && b == 0)
            if(x[a+1][b]==0&&x[a][b+1]==0&&x[a+1][b+1]==0)
                return true;
        if(b == 0 && a == x.length-1)
            if(x[a][b+1]==0&&x[a-1][b]==0&&x[a-1][b+1]==0)
                return true;
        if(a == x.length-1 && b==x[a].length-1)
            if(x[a-1][b]==0&&x[a][b-1]==0&&x[a-1][b-1]==0)
                return true;
        if(a == 0 && b==x[a].length-1)
            if(x[a+1][b]==0&&x[a][b-1]==0&&x[a+1][b-1]==0)
                return true;
        if(x[a+1][b]==0&&x[a][b+1]==0&&x[a-1][b]==0&&x[a][b-1]==0&&x[a+1][b+1]==0&&x[a-1][b+1]==0&&x[a-1][b-1]==0&&x[a+1][b-1]==0)
            return true;
        return false;
    }
    int counter()
    {
        int k = 0;
        for(int i = 0; i<x.length; i++)
        {
            for(int j = 0; j<x[0].length; j++)
            {
                if(x[i][j]==0)
                {
                    if(check(i, j))
                    {
                        k++;
                    }   
                }
            }
        }
        return(k);
    }
    public static void main(String args[])
    {
        covid ob = new covid();
        System.out.println(ob.counter());
    }
}
