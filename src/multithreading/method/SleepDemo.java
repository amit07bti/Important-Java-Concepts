package multithreading.method;

public class SleepDemo {
    public static void main(String[] args)  {
        for(int i=1; i<=10;  i++){
            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
