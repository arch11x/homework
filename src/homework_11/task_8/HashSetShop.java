package homework_11.task_8;

import java.util.HashSet;
import java.util.Set;
//не переопределили hashCode(),equals()
public class HashSetShop {
    public static void main(String[] args) {
        Set<Shop> shops = new HashSet<>();

        shops.add(new Shop("gippo", 5218));
        shops.add(new Shop("gippo", 5218));

        System.out.println(shops);
    }
}