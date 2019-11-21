package homework_13.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Composition {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(1);
        numbers.add(2);
        numbers.add(33);
        numbers.add(34);
        numbers.add(6);
        numbers.add(3);

        System.out.println(numbers);

        Optional<Integer> compInt = numbers.stream()
                .limit(5)
                .reduce((x, y) -> x * y);
        System.out.println(compInt);
    }
}
