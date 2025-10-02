package multithreding_221;

public class Hello {
    public static void main(String[] args) {
        Word w= new Word();
        w.start();
        for(; ;){
            System.out.println("hello:  "+Thread.currentThread().getName());
        }
    }
}
