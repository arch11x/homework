package homework_8.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        String string_1 = null;
        String string_2 = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put first number: ");
            string_1 = scanner.next();
            Integer number_1 = Integer.valueOf(string_1);
            System.out.println("Put second number: ");
            string_2 = scanner.next();
            Integer number_2 = Integer.valueOf(string_2);

            System.out.println("Your number: " + number_1 + " and " + number_2);
            int x = number_1 / number_2;
            System.out.println("Your unit of action: " + x);
        } catch (Exception e) {
            System.err.println("Division by zero exception ");
        }
    }
}
