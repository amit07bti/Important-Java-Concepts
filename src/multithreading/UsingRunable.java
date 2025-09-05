package multithreading;

public class UsingRunable  implements Runnable{


    @Override
    public void run() {
        System.out.println("runnable thread start...");
    }


    public static void main(String[] args) {
        UsingRunable thread1= new UsingRunable();
        Thread s= new Thread(thread1);
        s.getState();
        s.start();
        s.start();


    }
}
