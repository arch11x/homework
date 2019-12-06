package homework_17.task_2;

import java.util.ArrayList;
import java.util.OptionalDouble;


public class List {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(9);
        number.add(7);
        System.out.println(number);

        OptionalDouble average = number.stream().mapToInt(e -> e).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }
    }
}
