package homework_13.task_10;

import homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneMap {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", 10000));
        phones.add(new Phone("Samsung", 934));
        phones.add(new Phone("Xiaomi", 314));
        phones.add(new Phone("Apple", 53));
        phones.add(new Phone("Huawei", 515));

        Map<String, Long> grouping = phones.stream()
                .collect(Collectors.groupingBy(Phone::getModel, Collectors.counting( )));

        for (Map.Entry<String, Long> entry : grouping.entrySet()) {
            System.out.println(entry);
        }
    }
}
