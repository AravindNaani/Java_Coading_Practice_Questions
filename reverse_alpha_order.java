// Reverse a List of Strings in alphabetical order with java 8 streams

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class reverse_alpha_order {

    public static void main(String[] args) {
        
        List<String> list = List.of("Java", "Python", "C#", "Java", "Kotlin", "Python");

      List<String> revOrderList =  list.stream()
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toList());

                System.out.println(revOrderList);
                reverseAlphaOrderWithoutJava8(list);

    }

    public static void reverseAlphaOrderWithoutJava8(List<String> list){

        List<String> list2 = new ArrayList<>(list);
        
        Collections.sort(list2,Comparator.reverseOrder());

        System.out.println(list2);
    }
    
}
