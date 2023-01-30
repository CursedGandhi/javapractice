class Table {
    void printTable(int n)
    {
        synchronized(this){
            for(int i = 1; i<= 5; i++)
            {
                System.out.println(n*i);
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {}
        }
    }
}
class MyThread1 extends Thread
{
    Table t;
    MyThread1(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class MyThread2 extends Thread
{
    Table t;
    MyThread2(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(100);
    }
}
class Test
{
    public static void main(String[] args) {
        Table t1 = new Table();
        Table t2 = new Table();
        MyThread1 m1 = new MyThread1(t1);
        MyThread2 m2 = new MyThread2(t2);
        m1.start();
        m2.start();
    }
}