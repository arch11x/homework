package homework_13.task_9;

import homework_13.task_3.Phone;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortApple {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", 10000));
        phones.add(new Phone("Samsung", 934));
        phones.add(new Phone("Xiaomi", 314));
        phones.add(new Phone("Apple", 53));
        phones.add(new Phone("HTC", 515));


        List<Phone> appleGroup = phones.stream()
                .filter(phone -> phone.getModel().contains("Apple"))
                .collect(Collectors.toList());

        List<Phone> anotherGroup = phones.stream()
                .filter(phone -> !phone.getModel().contains("Apple"))
                .collect(Collectors.toList());

        List<Phone> concat = Stream.concat(appleGroup.stream(), anotherGroup.stream()).collect(Collectors.toList());
        System.out.println(concat);
    }
}