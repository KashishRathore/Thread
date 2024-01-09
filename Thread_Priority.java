package Thread;

class MyThr1 extends Thread{
    public MyThr1 (String name){
        super(name);
    }
    public void run(){
            System.out.println("Thankyou " + this.getName());
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        //Ready Queue: T1 T2 T3 T4
        //min priority = 1
        //nrml priority = 5
        //max priority = 10

        MyThr1 t1 = new MyThr1("Kashish1");
        MyThr1 t2 = new MyThr1("Kashish2");
        MyThr1 t3 = new MyThr1("Kashish3");
        MyThr1 t4 = new MyThr1("Kashish4");
        MyThr1 t5 = new MyThr1("Kashish5");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("The priority of the Thread t1 is : " + t1.getPriority());
        System.out.println("The priority of the Thread t2 is : " + t2.getPriority());
        System.out.println("The priority of the Thread t3 is : " + t3.getPriority());
        System.out.println("The priority of the Thread t4 is : " + t4.getPriority());
        System.out.println("The priority of the Thread t5 is : " + t5.getPriority());
    }
}
