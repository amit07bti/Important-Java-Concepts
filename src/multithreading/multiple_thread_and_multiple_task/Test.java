package multithreading.multiple_thread_and_multiple_task;

public class Test {
    public static void main(String[] args) {

        Task1 t1=new Task1();
        t1.start();

        Task2 t2= new Task2();
        t2.start();

        Task3 t3= new Task3();
        t3.start();
    }
}
