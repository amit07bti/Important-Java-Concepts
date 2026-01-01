package exception_handling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {


        List<String> fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("The ArrayList Elements are:  ");

        for (String s: fruits){
            System.out.println(s);
        }

//        Iterator <String> i=fruits.iterator();
//        String str;
//
//        while (i.hasNext()){
//             str= i.next();
//            if(str.equals("Mango")){
//                i.remove();
//                //fruits.remove(str);
//            }
//
//        }
        for(String f : fruits){
            if(f.equals("Orange")){
                fruits.remove(f); // ❌ Runtime error – ConcurrentModificationException
            }
        }

    }
}
