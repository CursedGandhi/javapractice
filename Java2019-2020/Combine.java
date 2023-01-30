import java.io.*;
public class Combine 
{
    int com[];
    int size;
    Combine(int nn)
    {
        size=nn;
        com=new int[size];
    }
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    void inputarray()throws IOException
    {
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)
        {
            com[i]=Integer.parseInt(in.readLine());
        }
    }
    void sort()
    {
        for (int i = 0; i < size-1; i++) 
        {
            int min = i; 
            for (int j = i+1; j < size; j++) 
                if (com[j] < com[min]) 
                    min = j; 
            int temp = com[min]; 
            com[min] = com[i]; 
            com[i] = temp; 
        }
    }
    Combine mix(Combine A)
    {
        Combine C=new Combine(size+A.size-1);
        for(int i=0;i<(size);i++)
        {
            C.com[i]=com[i];
        }
        for(int i=size;i<C.size;i++)
        {
            C.com[i]=A.com[i];
        }
        return C;
    }
    void display()
    {
        System.out.println("Array Elements");
        for(int i=0;i<size;i++)
        {
            System.out.println(com[i]);
        }
    }
    public static void main()throws IOException
    {
        Combine A=new Combine(5);
        Combine B=new Combine(6);
        A.inputarray();
        B.inputarray();
        Combine C=B.mix(A);
        C.sort();
        C.display();
    }
}
