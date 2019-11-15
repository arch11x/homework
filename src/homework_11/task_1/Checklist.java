package homework_11.task_1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checklist {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Artur");
        strings.add("Egorka");
        strings.add("Dima");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        boolean Name = true;
        while (Name) {
            String name = scanner.nextLine();
            if (strings.contains(name)) {
                System.out.println("You are on the list-go through!");
                Name = false;
            } else {
                System.out.println("Sorry, you're not on the list");
            }
        }
    }
}