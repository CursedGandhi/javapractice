public class RefPassing
{
    void show(int a[])
    {
        for(int i=0;i<0;i++)
        {
            a[i]++;
        }
        System.out.println("Values of a in show()");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    void main()
    {
        int arr[]={4,0,1,3,5};
        System.out.println("Values before calling show()");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]+" ");
        }
        show(arr);
        System.out.println("Values after calling show()");
        for(int i=0;i<5;i++)
        System.out.println(arr[i]+" ");
    }
}