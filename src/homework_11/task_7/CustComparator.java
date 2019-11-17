package homework_11.task_7;

import java.util.Comparator;

// для стандартных типов в джава можно использовать готовый функционал в виде new TreeSet<>(Collections.reversedOrder());
public class CustComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer intFirst, Integer intSecond) {
        return intFirst.compareTo(intSecond);
    }
}
