package multithreading.method;

public class Demo_intrupted extends  Thread{

    public void  run(){
        try{
            for(int i=1;  i<=5;  i++){
                System.out.println(i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println("Thread Interrupted"+e);
        }
    }


    public static void main(String[] args) {
        Demo_intrupted t= new Demo_intrupted();
        t.start();
        t.interrupt();
    }

}
