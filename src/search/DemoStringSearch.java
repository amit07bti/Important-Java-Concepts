package search;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoStringSearch {
    public static void main(String[] args) {

        ArrayList<String> numbers= new ArrayList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");

        String target="five";
        for(int i=0; i<numbers.size();  i++){
            System.out.println(numbers.get(i));
             if(target==numbers.get(i)){
                 System.out.println("\n");
                 System.out.println(target);
                 break;
             }
        }




    }
}
