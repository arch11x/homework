package homework_13.task_8;

import homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// +
public class SortPhones {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Samsung", 1500));
        phones.add(new Phone("Xiaomi", 230));
        phones.add(new Phone("Apple", 1412));
        phones.add(new Phone("Apple", 3000));
        phones.add(new Phone("Apple", 7452));
        phones.add(new Phone("Huawei", 500));
        phones.add(new Phone("Nokia", 100));
        phones.add(new Phone("Nokia", 533));

        Map<String, List<Phone>> modelGroup = phones.stream()
                .collect(Collectors.groupingBy(Phone::getModel));
        System.out.println(modelGroup);

        System.out.println("===============================================");
        Set<Map.Entry<String, List<Phone>>> entries = modelGroup.entrySet();
        for (Map.Entry<String, List<Phone>> entry : entries) {
            System.out.println(entry);
        }
    }
}
