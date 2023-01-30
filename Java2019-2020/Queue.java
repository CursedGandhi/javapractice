public class Queue 
{
    int q[]=new int[5];
    int f, r, size, val;
    Queue()
    {
        for(int i=0;i<5;i++)
        {
            q[i]=0;
        }
        f=-1;
        r=-1;
        size=0;
    }
    void insertQueue(int val)
    {
        if(r==(size-1))
        {
            System.out.println("Queue Overflows");
        }
        else
        {
            if(f==-1&&r==-1)
            {
                f=0;
                r=0;
            }
            else
            {
                r=r+1;
            }
            q[r]=val;
        }
    }
    void deleteQueue()
    {
        if(f==-1&&r==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            val=q[f];
            System.out.println("Item deleted "+val);
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            {
                f=f+1;
            }
        }
    }
    void display()
    {
        System.out.println("Elements of the queue are ");
        for(int i=f;i<=r;i++)
        {
            System.out.println(q[i]);
        }
    }
    public static void main()
    {
        Queue ob=new Queue();
        ob.deleteQueue();
        ob.insertQueue(5);
        ob.insertQueue(10);
        ob.insertQueue(12);
        ob.display();
        ob.deleteQueue();
        ob.display();
        ob.deleteQueue();
        ob.deleteQueue();
        ob.deleteQueue();
    }
}