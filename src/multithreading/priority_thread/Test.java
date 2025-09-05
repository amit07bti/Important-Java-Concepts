package multithreading.priority_thread;

public class Test extends Thread{


    public void run(){
        System.out.println("child thread:  "+Thread.currentThread().getPriority());
        System.out.println("child thread priority:  "+Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {

        System.out.println("main thread old priority: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("main thread new  priority:" +Thread.currentThread().getPriority());


        Test t=new Test();
        t.start();
    }
}
