package Thread;

class MyThreadRunaable1 implements Runnable{
    public void run() {
        int i = 0;
        while(i<=5){
           System.out.println("I am a Thread 1 not a Threat 1");
           i++;
        }
    }
}

class MyThreadRunaable2 implements Runnable{
    public void run() {
        int i = 0;
        while(i<=5){
           System.out.println("I am a Thread 2 not a Threat 2");
           i++;
        }
    }  
}

public class Runnable_interface {
    public static void main(String[] args) {
        MyThreadRunaable1 bullet1 = new MyThreadRunaable1();
        Thread t1 = new Thread(bullet1); // making a Gun 1
        MyThreadRunaable2 bullet2 = new MyThreadRunaable2();
        Thread t2 = new Thread(bullet2); // making a Gun 2

        t1.start();
        t2.start();


    }
}
