package homework_13.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(13);
        numbers.add(1);
        numbers.add(33);
        numbers.add(2);

        System.out.println(numbers);

        Optional<Integer> intStream = numbers.stream()
                .filter(integer -> integer > 22)
                .findFirst();
                // а если в коллекции не будет числа > 22? будет исключение, когда ты вызовешь метод get(), добавь проверку
        System.out.println(intStream.get());
    }
}
