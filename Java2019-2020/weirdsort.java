import java.io.*;
public class weirdsort
{
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int n;
    int arr[];
    void input()throws IOException
    {
        boolean ch=false;
        do
        {
            System.out.println("Give number of integers:");
            n=Integer.parseInt(in.readLine());
            if(n>50)
            ch=true;
            else
            ch=false;
        }while(ch);
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Give integer "+(n+1));
            arr[i]=Integer.parseInt(in.readLine());
        }
    }
    void rearrange()
    {
        int temp = 0;  
        for(int i=0; i < n; i++)
        {  
            for(int j=1; j < (n-i); j++)
            {  
                if(arr[j-1] > arr[j])
                { 
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp; 
                }
            }
        }
        int k=0;
        temp=0;
        for(int i=(n-1);i>(n/2);i--)
        {
            temp=arr[(n/2)+k];
            arr[(n/2)+k]=arr[i];
            arr[i]=temp;
            k++;
        }
    }
}