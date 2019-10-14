package homework_3.task_2;


public class Task_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int sum = 0;
        int average = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum / array.length;

        }
        System.out.println("Среднее арифметическое массива: " + average);


    }
}
