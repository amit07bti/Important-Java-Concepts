package java_7_and_java8;

import java.util.Comparator;

public class Example_3 {
    public static void main(String[] args) {
//Before
        Comparator <Integer> c1= new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };
        System.out.println("Comparator 1 : "+c1.compare(20,20));

        //After
        Comparator<Integer> c2=( a,  b)->a.compareTo(b);
        System.out.println("Comparator 2 : "+c2.compare(20,20));
    }
}
