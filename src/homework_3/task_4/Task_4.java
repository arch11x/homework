package homework_3.task_4;

// не очень красиво выводит, но выводит
public class Task_4 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (1 + i) * (1 + j);
                System.out.print(array[i][j] + " ");
// пустая строка не нужа
            }
// пустая строка не нужа
            System.out.println();
        }
// пустая строка не нужа
// пустая строка не нужа
    }
}
