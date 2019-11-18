package homework_12.task_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Warehouse {
    public static void main(String[] args) {
        Set<Phone> phones = new HashSet<>();

        phones.add(new Phone("Apple"));
        LocalDateTime booksTime = LocalDateTime.now();
        System.out.println("First box was added on " + booksTime);
    }
}