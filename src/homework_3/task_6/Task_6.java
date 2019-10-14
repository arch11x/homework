package homework_3.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] array = {5, 6, 2, 7, 3, 4, 1, 0, 8, 5};
        int[] arrayNew = new int[array.length];
        int value = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayNew[value] = array[i];
                value++;
            }
        }


        int[] even = Arrays.copyOf(arrayNew, value);
        System.out.println(Arrays.toString(even));


    }
}
