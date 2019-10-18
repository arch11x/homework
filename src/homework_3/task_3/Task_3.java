package homework_3.task_3;

import java.util.Arrays;

// +
public class Task_3 {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4, 5, 7, 9, 3};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
