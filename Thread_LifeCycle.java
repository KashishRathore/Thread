package Thread;

class MyThreadRunaable1 implements Runnable{
    public void run() {
        int i = 0;
        while(i<=5){
           System.out.println("I am a Thread 1 not a Threat 1");
           i++;
        }
    }
    //Terminated 
}

class MyThreadRunaable2 implements Runnable{
    public void run() {
        int i = 0;
        while(i<=5){
           System.out.println("I am a Thread 2 not a Threat 2");
           i++;
        }
    } 
    //Terminated 
}

public class Thread_LifeCycle {
    public static void main(String[] args) {
        //New
        MyThreadRunaable1 bullet1 = new MyThreadRunaable1();
        Thread t1 = new Thread(bullet1); // making a Gun 1
        MyThreadRunaable2 bullet2 = new MyThreadRunaable2();
        Thread t2 = new Thread(bullet2); // making a Gun 2

        //Runnable
        t1.start();
        t2.start();

        //Running

    }
}
