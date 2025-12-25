import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Sort a List of Strings in alphabetical order and print the sorted list.
public class sort_alph_order {
    private static List<String> orderList;

    public static void main(String[] args) {
        
        List<String> list = List.of("Java", "Python", "C#", "Java", "Kotlin", "Python");

        orderList = list.stream()
            .sorted(String.CASE_INSENSITIVE_ORDER)   // case insensitive way
            .collect(Collectors.toList());
        
        System.out.println(orderList);
        sort_alph_order_withoutJava8(list);
    }

    // sort without using java 8 streams
    public static void sort_alph_order_withoutJava8(List<String> list){
        
        List<String> listCopy =new ArrayList<>(list);
        Collections.sort(listCopy);
        System.out.println(listCopy);
    }
}
