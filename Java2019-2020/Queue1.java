public class Queue1 
{
    int Que[];
    int size;
    int front;
    int rear;
    Queue1(int mm)
    {
        size=mm;
        front=0;
        rear=0;
        Que=new int[size];
        for(int i=0;i<size;i++)
        {
            Que[i]=0;
        }
    }
    void addele(int v)
    {
        if(rear==(size-1))
        System.out.println("Overflow");
        else
        {
            Que[rear]=v;
            rear++;
        }
    }
    int delete()
    {
        if(front==0&&rear==0)
        {
            System.out.println("Underflow");
            return(-999);
        }
        else
        {
            if(front==rear)
            {
                front=0;
                rear=0;
            }
            else
            {
                front++;
            }
            return(Que[front]);
        }
    }
    void display()
    {
        System.out.println("Queue elements are:");
        for(int i=0;i<rear;i++)
        {
            System.out.println(Que[i]);
        }
    }
    public static void main()
    {
        Queue1 ob=new Queue1(5);
        ob.addele(2);
        ob.addele(4);
        ob.addele(5);
        System.out.println("Item deleted "+ob.delete());
        ob.display();
    }
}