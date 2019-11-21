package homework_13.task_6;

import homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneCollection {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple"));
        phones.add(new Phone("Nokia"));
        phones.add(new Phone("Nokia"));
        phones.add(new Phone("Apple"));
        phones.add(new Phone("Xiaomi"));
        phones.add(new Phone("Xiaomi"));
        phones.add(new Phone("Blackberry"));
        phones.add(new Phone("Samsung"));

        System.out.println(phones);

        phones.stream().distinct().forEach(System.out::println);
    }
 }
