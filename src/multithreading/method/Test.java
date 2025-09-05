package multithreading.method;

public class Test extends Thread {


    public void run(){
        System.out.println("Task:  "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("hello : " +Thread.currentThread().getName());

        Test t1=new Test();
        t1.setName("Amit");
        t1.start();

        Test t2=new Test();
        t2.setName("Anjali");
        t2.start();






    }}