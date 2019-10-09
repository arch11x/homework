package homework_2.task_7;

public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            sum += i;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99 = " + sum);
    }
}

