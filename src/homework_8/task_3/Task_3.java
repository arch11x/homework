package homework_8.task_3;

import java.util.Scanner;

public class Task_3 {
    private static final int MAX_SIZE = 3;

    public static void main(String[] args) throws MyCustomException {
        String string = null; // если не используешь переменную за пределами try-catch, то создавай ее максимально близко к месту где будешь использовать
        int arraySize; // если не используешь переменную за пределами try-catch, то создавай ее максимально близко к месту где будешь использовать
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put array size: ");
            string = scanner.next(); // scanner.nextInt()
            arraySize = Integer.parseInt(string);
            if (arraySize > 5) {
                throw new MyCustomException("Array size too large");
            }
            // я думаю еще нужна проверка, чтобы число было > 0
            // по идее неплохо было бы создавать этот массив
            System.out.println(arraySize + " excellent choice");
        } catch (MyCustomException e) {
            System.err.println("Enter a smaller array!!!!");
        }
    }
}
