package homework_12.task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorMain {
    public static void main(String[] args) {
        Comparator<String> stringComparator = (String first, String second) -> -first.compareTo(second);
        List<String> stringList = new ArrayList<>();
        stringList.add("I");
        stringList.add("love");
        stringList.add("TMS");

        stringList.sort(stringComparator);
        System.out.println("Result: " + stringList);
    }
}