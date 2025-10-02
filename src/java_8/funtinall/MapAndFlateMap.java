package java_8.funtinall;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlateMap {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("banana","mango","apple","orange");

        List<String> capitlaized  =names.stream().map(name->name.substring(0,1).toUpperCase()+name.substring(1)).collect(Collectors.toList());
        System.out.println(capitlaized);

        List<List<String>> namesF= Arrays.asList(
                             Arrays.asList("banana","mango","apple","orange"),
                             Arrays.asList("papaya","carrit"));
        List<String> flatemap=namesF.stream()
                .flatMap(nested->nested.stream())
                .map(name->name.substring(0,1).toUpperCase()+name.substring(1)).collect(Collectors.toList());
        System.out.println(flatemap);

    }
}
