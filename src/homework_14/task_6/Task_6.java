package homework_14.task_6;

import java.util.Arrays;
import java.util.stream.IntStream;
//"пузырьком" тоже можно же сделать?
// пузырек - это алгоритм сортировки, а тебе нужно смержить (склеить)
public class Task_6 {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 4, 5};
        int[] arraySecond = {0, 2, 3, 6};
        // это не оптимальное решение, ты теряешь преимущество того, что массивы изначально отсортированы
        int[] result = IntStream.concat(Arrays.stream(arrayFirst), Arrays.stream(arraySecond)).sorted().toArray();
        System.out.println(Arrays.toString(result));
    }
}
