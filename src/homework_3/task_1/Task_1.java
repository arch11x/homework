package homework_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        int sum = 0;

        System.out.println("Введите значения массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println("Сумма чисел массива равна: " + sum);
        int min = 0; // = array[0]
        int max = 0; // = array[0] иначе может некорректно работать
        min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
// пустая строка не нужа
        }

        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);
// пустая строка не нужа
// пустая строка не нужа
    }
}
