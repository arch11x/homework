package homework_11.task_4;

import java.util.ArrayList;
import java.util.List;

// +
public class RetainElement {
    public static void main(String[] args) {
        List<String> tomFavoriteColors = new ArrayList<>();
        tomFavoriteColors.add("Dima");
        tomFavoriteColors.add("Artur");
        tomFavoriteColors.add("Alex");
        tomFavoriteColors.add("Egorka");

        List<String> harryFavoriteColors = new ArrayList<>();
        harryFavoriteColors.add("Matvey");
        harryFavoriteColors.add("Artur");
        harryFavoriteColors.add("Alex");
        harryFavoriteColors.add("Kirill");

        tomFavoriteColors.retainAll(harryFavoriteColors);
        System.out.println("Both Tom's and Harry's favourite colors are: " + tomFavoriteColors);
    }
}
