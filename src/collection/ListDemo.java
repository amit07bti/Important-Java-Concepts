package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListDemo {

    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(23);
        l.add(34);
        l.add(34.5);
        l.add("Amit");
       Iterator list= l.iterator();
       while (list.hasNext()){
           System.out.println(list.next());
       }
        Stack stack= new Stack();
       stack.add(100);
       stack.add(200);
       stack.add(300);
        Iterator listp= l.iterator();
        while (listp.hasNext()){
            System.out.println(listp.next());
        }
        System.out.println(stack);



    }
}
