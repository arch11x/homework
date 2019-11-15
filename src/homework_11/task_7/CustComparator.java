package homework_11.task_7;

import java.util.Comparator;

public class CustComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer intFirst, Integer intSecond) {
        return intFirst.compareTo(intSecond);
    }
}