package java_7_and_java8;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        // before
        int total=0;
        for(int i=0;  i<=50;  i++){
            total=total+i;
        }
        System.out.println(total);

        //after

        int total1= IntStream.rangeClosed(0,50)
                .map(Integer::new)
                .sum();
        System.out.println("Some of java8:  "+total1);
    }
}
