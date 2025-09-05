package multithreading.method;

public class DemoYield extends Thread{

    public  void  run(){
        for (int i =1; i<=5;   i++){
            System.out.println(Thread.currentThread().getName()+"  -  "+i);
        }
    }

    public static void main(String[] args) {
        DemoYield t = new DemoYield();
        t.start();
        Thread.yield();   //todo if you want main method to stop and provide chance to other threads  for execution.



        for (int i=1; i<=5;   i++){
            System.out.println(Thread.currentThread().getName()+ " - "+i);
        }
    }
}
