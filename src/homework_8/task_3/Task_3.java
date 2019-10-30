package homework_8.task_3;

import java.util.Scanner;

public class Task_3 {
    private static final int MAX_SIZE = 3;

    public static void main(String[] args) throws MyCustomException {
        String string = null;
        int arraySize;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put array size: ");
            string = scanner.next();
            arraySize = Integer.parseInt(string);
            if (arraySize > 5) {
                throw new MyCustomException("Array size too large");
            }
            System.out.println(arraySize + " excellent choice");
        } catch (MyCustomException e) {
            System.err.println("Enter a smaller array!!!!");
        }
    }
}
