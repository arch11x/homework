package homework_14.task_3;

import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        Map<String, List<Integer>> mapFirst = new HashMap<>();
        List<Integer> listFirst = new ArrayList<>();
        listFirst.add(1);
        listFirst.add(2);
        listFirst.add(3);
        listFirst.add(7);
        mapFirst.put("First", listFirst);
        System.out.println(mapFirst);

        Map<String, List<Integer>> mapSecond = new HashMap<>();
        List<Integer> listSecond = new ArrayList<>();
        listSecond.add(4);
        listSecond.add(5);
        listSecond.add(6);
        listSecond.add(8);
        listSecond.add(9);
        mapSecond.put("Second", listSecond);
        System.out.println(mapSecond);

        // у тебя программа работает некорректно, попробуй во вторую мапу заменить "Second" -> "First" и посмотри результат
        Map<String, List<Integer>> mapthird = new HashMap<>(mapFirst);
        for (int i = 0; i < mapSecond.size(); i++) {
            int finalI = i; // нужна ли эта переменная?
            mapSecond.forEach((key, value) -> mapthird.merge(key, value, (v1, v2) -> Collections.singletonList(v1.get(finalI) + v2.get(finalI))));
        }
        System.out.println(mapthird);
    }
}
