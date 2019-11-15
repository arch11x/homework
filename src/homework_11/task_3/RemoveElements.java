package homework_11.task_3;

import java.util.ArrayList;
import java.util.List;

public class RemoveElements {
    public static void main(String[] args) {
        List<String> firstListName = new ArrayList<>();
        firstListName.add("Artur");
        firstListName.add("Dima");
        firstListName.add("Egorka");
        firstListName.add("Matvey");

        List<String> secondListName = new ArrayList<>();
        secondListName.add("Alex");
        secondListName.add("Artur");
        secondListName.add("Dima");
        secondListName.add("Kirill");

        firstListName.removeAll(secondListName);
        System.out.println("First name list " + firstListName + " , but in second list no those names ");
    }
}