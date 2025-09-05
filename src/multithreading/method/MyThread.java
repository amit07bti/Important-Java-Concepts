package multithreading.method;

public class MyThread extends Thread{

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000, -1);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

    }
}
