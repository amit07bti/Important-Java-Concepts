package multithreding_221;

public class MyThread extends Thread{
    public void  run(){

    }

    public static void main(String[] args) {
        MyThread t1= new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

    }
}
