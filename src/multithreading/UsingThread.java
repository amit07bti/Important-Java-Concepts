package multithreading;

public class UsingThread extends Thread{



    public void run(){
        System.out.println("thread start...");
    }


    public static void main(String[] args) {
        UsingThread thread= new UsingThread();

        thread.start();    // is going on dead state
        thread.start();
    }

}
