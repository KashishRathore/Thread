package Thread;

class MyThread extends Thread{
    public void run(){
        int i = 0;
        while(i<=20){
           System.out.println("My Cooking Thread is Running");
           System.out.println("I am happy!");
           i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<=20){
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Threading_Class{
    public static void main(String[] args) {
        //Threading give concurrency
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
