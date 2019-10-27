package homework_7.task_9;

public class Task_9 {
    public static void main(String[] args) {
        String[] array = {"Car", "Bike", "I love java", "Biology", "Minsk"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 5) {
                System.out.println(array[i]);
            }
        }
    }
}
