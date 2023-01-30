class Main{
    public static void main(String args[])
    {
        CountDn c1 = new CountDn();
        CountDn c2 = new CountDn(11);
        c1.display();
        c1.Inc();
        c1.Inc();
        c1.Inc();
        c1.display();
        c1.Dec();
        c1.Dec();
        c1.display();

        c2.display();
        c2.Inc();
        c2.Inc();
        c2.Inc();
        c2.display();
        c2.Dec();
        c2.Dec();
        c2.display();
    }
}
class Counter {
    protected int count;
    public Counter()
    {
        count = 0;
    }
    public Counter(int c)
    {
        count = c;
    }
    public void display()
    {
        System.out.println("COUNT = "+count);
    }
    public void Inc()
    {
        count ++;
    }
}
class CountDn extends Counter{
    public CountDn()
    {
        Counter c1 = new Counter();
    }
    public CountDn(int c)
    {
        Counter c2 = new Counter(c);
        super.count = c2.count;
    }
    public void Dec()
    {
        count--;
    }
}

