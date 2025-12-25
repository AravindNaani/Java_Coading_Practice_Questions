import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Find duplicate elements in an List using java 8 streams

public class find_dup_elements {

    public static void main(String[] args) {
        List<String> list = List.of("Java", "Python", "C#", "Java", "Kotlin", "Python");

        find_dup_elements_without_java8(list);

        Set<String> set = new HashSet<>();
        List<String> dups = list.stream()
                                    .filter(s -> !set.add(s))
                                    .collect(Collectors.toList());

        System.out.println(dups);
    }

  // Find duplicate elements without using java 8 streams

    public static void find_dup_elements_without_java8(List<String> list){

        Set<String> set = new HashSet<>();

        Set<String> duplicates = new HashSet<>();
        
        for (String ele : list) {
            if(!set.add(ele)){
                duplicates.add(ele);
            }
        }
        System.out.println(duplicates);
    }
}