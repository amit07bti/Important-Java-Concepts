package multithreading.daemon_Thread;

public class Test extends Thread{


    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread......");
        }else{
            System.out.println("child thread.......");
        }

    }


    public static void main(String[] args) {
        Thread.currentThread().setDaemon(true);
        System.out.println("main thread");
        Test t1= new Test();
        t1.setDaemon(true);
        t1.start();
    }
}
