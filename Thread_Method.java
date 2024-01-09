package Thread;

class MyThr1 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 5) {
            System.out.println("Thankyou");
            i++;
        }
    }
}

class MyThr2 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 5) {
            System.out.println("Thankyou 2");
            i++;
        }
    }
}

public class Thread_Method {
    public static void main(String[] args) {
        // One by One
        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();
        t1.start();
        // try{
        // t1.join();
        // }
        // catch(Exception e){
        // System.out.println(e);
        // }
        t2.start();
    }
}
