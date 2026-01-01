package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DStack extends Thread {
    static ArrayList l = new ArrayList<>();
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Child thread updating List...");
        l.add("D"); // ❌ modifying list while main thread is iterating
    }
    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("C");

        DStack t = new DStack();
        t.start(); // start child thread

        Iterator str = l.iterator();

        while (str.hasNext()) {
            String s1 = (String) str.next();
            System.out.println("Main Thread Iterating: " + s1);

            // Main thread sleeping — gives time to child to modify
            Thread.sleep(3000);
        }

        System.out.println("Final list: " + l);
    }
}
