package homework_5.task_2;

import java.util.Scanner;

// +
public class Main {
    public static void main(String[] args) {
        Warehouse product = new Warehouse();
        int next;

        product.getArray();
        System.out.println("Введите элемент массива: ");
        Scanner in = new Scanner(System.in);
        next = in.nextInt();
        product.next(next);
    }
}
