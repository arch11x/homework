package homework_2.task_3;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {
            sum += i;
        }
        System.out.println("The sum of the numbers: " + sum);
    }
}