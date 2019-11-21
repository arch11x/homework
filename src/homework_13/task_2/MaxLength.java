package homework_13.task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxLength {
    public static void main(String[] args) {
        ComparatorString stringComparator = new ComparatorString();
        List<String> stringList = new ArrayList<>();
        stringList.add("I love java");
        stringList.add("My name is Artur");
        stringList.add("world");

        System.out.println("First method: ");
        Optional<String> max = stringList.stream().max(stringComparator);
        System.out.println(max.get());

        System.out.println("Second method: ");
        Optional<String> collect = stringList.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(collect.get());
    }
}
