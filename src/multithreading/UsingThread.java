package multithreading;

public class UsingThread extends Thread{



    public void run(){
        System.out.println("thread start...");
    }


    public static void main(String[] args) {
        UsingThread t1= new UsingThread();
        t1.start();

                                            // is going on dead state
        UsingThread t2= new UsingThread();
        t2.start();
        UsingThread t3= new UsingThread();
        t3.start();

        UsingThread t4= new UsingThread();
        t4.start();

        UsingThread t5= new UsingThread();
        t5.start();

    }

}
