// Find the longest string in a list of strings using java 8 streams

import java.util.Comparator;
import java.util.List;

public class Longest_str_list {
    
    public static void main(String[] args) {
        
        List<String> list = List.of("Java", "Python", "C#", "Java", "Kotlin", "Python");

        list.stream()
            .max(Comparator.comparingInt(String::length))
            .ifPresent(System.out::println);   // or .orElse("null");

            longest_str_list_without_java8(list);
    }

    public static void longest_str_list_without_java8(List<String> list){

        String longest = list.get(0);

        for (String ele : list){
            if(ele.length() > longest.length()){
                longest = ele;
            }
        }

        System.out.println(longest);
    }
}
