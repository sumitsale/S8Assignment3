class numbers implements Runnable
{
    Thread t;
    boolean running=true;
    public numbers(String name, int p)
    {
        t=new Thread(this,name);
        t.setPriority(p);
        t.start();
    }
    public void run()
    {
        System.out.println("\n"+t+ " start");
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
        System.out.println(t+ " exiting");
    }
}
class squareRoot implements Runnable
{
    Thread t;
    boolean running=true;
    public squareRoot(String name,int p)
    {
        t=new Thread(this,name);
        t.setPriority(p);
        t.start();
    }
    public void run()
    {
        System.out.println("\n"+t+ " start");
        for(int i=1;i<=5;i++)
        {
            System.out.println(i*i);
        }
        System.out.println(t+ " exiting");
    }
}


class S8Assignment3
{
    public static void main(String args[])
    {
        new numbers("Numbers HIGH PRIORITY",Thread.MAX_PRIORITY);
        new squareRoot("Square MIDDLE PRIORITY",Thread.NORM_PRIORITY);
        Thread t=Thread.currentThread();
        t.setPriority(Thread.MIN_PRIORITY);
        t.setName("Cube LOW PRIORITY");
        
        System.out.println("\n"+t+ " start");
        for(int i=1;i<=5;i++)
        {
            System.out.println(i*i*i);
        }
        System.out.println(t+ " exiting");
    }
}