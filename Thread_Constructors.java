package Thread;

class MyThr extends Thread{
    public MyThr (String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<=2){
            System.out.println("I am a Thread");
            i++;
        }
    }
}

public class Thread_Constructors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Kashish");
        MyThr t2 = new MyThr("Harry");

        t1.start();
        t2.start();

        System.out.println("The id of the Thread t1 is : " + t1.getId());
        System.out.println("The id of the Thread t2 is : " + t2.getId());

        System.out.println("The name of the Thread t1 is : " + t1.getName());
        System.out.println("The name of the Thread t2 is : " + t2.getName());

        System.out.println("The class of the Thread t1 is : " + t1.getClass());
        System.out.println("The class of the Thread t2 is : " + t2.getClass());
    }
}
