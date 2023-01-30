/*thread id will never go below 7 or 8 as the jvm assigns some threads to itself and then starts assigning ids to the program processes*/
public class Multithreading2 {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++)
        {
            ThreadId object = new ThreadId();
            object.start();
        }
    }
}

class ThreadId extends Thread
{
    public void run()
    {
        System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
    }
}