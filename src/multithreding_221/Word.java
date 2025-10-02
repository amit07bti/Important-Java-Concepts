package multithreding_221;

public class Word extends Thread {
    public  void  run(){
        for(; ;) {
            System.out.println("word:  " + Thread.currentThread().getName());
        }
    }
}
