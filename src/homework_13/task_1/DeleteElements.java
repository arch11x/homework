package homework_13.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteElements {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("java");
        listString.add("learn");
        listString.add("Alex");
        listString.add("developer");
        listString.add("homework");

        List<String> streamList = listString.stream()
                .filter(strings -> strings.length() > 5)
                .collect(Collectors.toList());
        System.out.println(streamList);
    }
}
