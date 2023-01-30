public class Multithreading3 {
    public static void main(String[] args) {
        classA a = new classA();
        classB b = new classB();
        classC c = new classC();
        a.start();
        b.start();
        c.start();
    }
}
class classA extends Thread
{
    public void run()
    {
        System.out.println("Starting Thread A...");
        for(int i = 1; i<=5; i++)
        {
            if(i==1)
            {
                Thread.yield();
            }
            System.out.println("From Thread A i = "+i);
        }
        System.out.println("Exiting Thread A...");
    }
}
class classB extends Thread
{
    public void run()
    {
        System.out.println("Starting Thread A...");
        for(int i = 1; i<=5; i++)
        {
            if(i==1)
            {
                Thread.yield();
            }
            System.out.println("From Thread B i = "+i);
        }
        System.out.println("Exiting Thread B...");
    }
}
class classC extends Thread
{
    public void run()
    {
        System.out.println("Starting Thread C...");
        for(int i = 1; i<=5; i++)
        {
            if(i==1)
            {
                Thread.yield();
            }
            if(i==3)
                try
                {
                    sleep(5000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            System.out.println("From Thread C i = "+i);
        }
        System.out.println("Exiting Thread C...");
    }
}
