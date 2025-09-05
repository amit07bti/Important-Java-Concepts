package multithreading.method;

public class DemoJoin_Method extends Thread{     //todo if a thread wants to wait for other thread to complete its task,then we should use join method.

       public  void  run(){


           try {
               for (int i=1;   i<=5;  i++){
                   System.out.println("child thread: "+i);
                   Thread.sleep(1000);
               }
           } catch (InterruptedException e) {
               System.out.println(e);
           }
       }

    public static void main(String[] args) throws InterruptedException {
        DemoJoin_Method t = new DemoJoin_Method();
        t.start();

        t.join();

        try {
            for (int i=1;   i<=5;  i++){
                System.out.println("main thread: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
