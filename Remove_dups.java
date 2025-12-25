import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Remove duplicates from a List of Strings and print the unique elements.

public class Remove_dups {

    public static void main(String[] args) {
        
        List<String> list = List.of("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> uniqueList = list.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
        
        System.out.println(uniqueList);
        removeDups_withoutJava8(uniqueList);
    }

// Remove duplicates without using java 8 streams
    public static void removeDups_withoutJava8(List<String> list){
        List<String> uniqueList = new ArrayList<>();

        for (String ele : list) {
            if(!uniqueList.add(ele)){
                uniqueList.add(ele);
            }
        }
        System.out.println(uniqueList);
    }
}
