package homework_13.task_7;

import homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinPrice {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Samsung", 1500));
        phones.add(new Phone("Xiaomi", 230));
        phones.add(new Phone("Apple", 3000));
        phones.add(new Phone("Huawei", 500));
        phones.add(new Phone("Nokia", 100));

        System.out.println(phones);

        Optional<Phone> min = phones.stream().min(Comparator.comparing(Phone::getPrice));
        System.out.println("Min price: " + min);
    }
}
