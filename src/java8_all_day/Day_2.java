package java8_all_day;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//todo Write a program to convert List of Strings to uppercase
public class Day_2 {
    public static void main(String[] args) {

        List<String> words= Arrays.asList("java","spring","springboot","microservice","sql");
        List<String>  UPPERCASE=words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(UPPERCASE);

    }
}
