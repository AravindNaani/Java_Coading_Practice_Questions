// Count occurrences of each String in a given List and print the results.

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrences{
    private static Map<String, Long> countMap;

    public static void main(String[] args) {

        List<String> list = List.of("Java", "Python", "C#", "Java", "Kotlin", "Python");

        countMap = list.stream()
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(countMap);
        countOfOccurreances_withOut_java8(list);
    }

    // Count occurrences without using java 8 streams
    public static void countOfOccurreances_withOut_java8(List<String> list){

        Map<String, Integer> countMap = new HashMap<>();

        for (String ele : list) {
            if(countMap.containsKey(ele)){
                countMap.put(ele, countMap.get(ele)+1);
            }else{
                countMap.put(ele, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}