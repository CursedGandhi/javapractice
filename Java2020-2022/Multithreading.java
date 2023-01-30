/*all calls of x.start run parallelly to reduce runtime. everytime you run the program you will obtain a different sequence of running */

public class Multithreading
{
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println("Multithreading is over...");
    }
}
class ThreadA extends Thread {
    public void run()
    {
        for(int i = 1; i<=5; i++)
        {
            System.out.println("From Thread A, i = "+i);
        }
        System.out.println("Exiting Thread A");
    }
}
class ThreadB extends Thread
{
    public void run()
    {
        for(int i = 1; i<=5; i++)
        {
            System.out.println("From Thread B, i = "+i);
        }
        System.out.println("Exiting Thread B");
    }
}
class ThreadC extends Thread
{
    public void run()
    {
        for(int i = 1; i<=5; i++)
        {
            System.out.println("From Thread C, i = "+i);
        }
        System.out.println("Exiting Thread C");
    }
}
