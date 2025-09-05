package multithreading.method;

public class Testt extends Thread{

    public void run(){
        try{
            for (int i=1; i<=5;  i++){
                System.out.println(i+ "  : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }


        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Thread t1= new Testt();
        t1.start();

        Thread t2= new Testt();
        t2.start();
    }
    }

