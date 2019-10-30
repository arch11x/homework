package homework_8.task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        String string = null;
        int number;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put number: ");
            string = scanner.next();
            number = Integer.parseInt(string);
            System.out.println("Your number: " + number);
        }catch (NumberFormatException e){
            System.err.println("Check the number format: " + string);
        }
    }
}
