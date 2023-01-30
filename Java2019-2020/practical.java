import java.io.*;
public class practical
{
    int N[];
    int s;
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    practical()
    {
        s=0;
    }
    void acceptSize()throws IOException
    {
        System.out.println("Enter size of array->");
        s=Integer.parseInt(in.readLine());
        if(s>=20)
        System.exit(0);
    }
    void inputArray(int size)throws IOException
    {
        N=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter number "+(i+1)+"->");
            N[i]=Integer.parseInt(in.readLine());
            System.out.println();
        }
    }
    void largestSum(int no[], int size)
    {
        int sum=0;
        if(size==1)
        {
            if(no[0]>0)
            sum=no[0];
            else
            sum=0;
        }
        else
        {
            int j=0;
            for (int i=0;i<size;i++)
            {
                j=no[i];
                if(i==0)
                {
                    if(no[i+1]>0)
                    j=j+no[i+1];
                }
                else if(i<size-1)
                {
                    if(no[i-1]>0)
                    j=j+no[i-1];
                    if(no[i+1]>0)
                    j=j+no[i+1];
                }
                else
                {
                    if(no[i-1]>0)
                    j=j+no[i-1];
                }
                if(j>sum)
                sum=j;
            }
        }
        System.out.println("Largest sum of positive integers at consecutive positions->"+sum);
    }
    void totalNegative(int no[], int size)
    {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+no[i];
        }
        System.out.println("Sum of negative integers->"+sum);
    }
    void sortDescending(int no[], int size)
    {
        System.out.println("Array in Descending order");
        int temp=0; 
        for(int i=0; i < size; i++)
        {  
            for(int j=1; j < (size-i); j++)
            {  
                if(no[j-1] < no[j])
                {  
                    temp = no[j-1];  
                    no[j-1] = no[j];  
                    no[j] = temp;  
                }                    
            }  
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(no[i]+"  ");
        }
        System.out.println();
    }
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        boolean ch;
        do{
            ch=false;
            practical ob=new practical();
            ob.acceptSize();
            ob.inputArray(ob.s);
            int k=0;
            for(int i=0;i<ob.s;i++)
            {
                if(ob.N[i]<0)
                k++;
            }
            int r=0;
            int a[]=new int[k];
            for(int i=0;i<ob.s;i++)
            {
                if(ob.N[i]<0)
                {
                    a[r]=ob.N[i];
                    r++;
                }
            }
            ob.totalNegative(a,k);
            ob.largestSum(ob.N,ob.s);
            ob.sortDescending(ob.N,ob.s);
            System.out.println("Would you like to restart?y/n");
            char u=in.readLine().charAt(0);
            if(u=='y')
            ch=true;
        }while(ch==true);
    }
}