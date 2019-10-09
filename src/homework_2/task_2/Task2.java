package homework_2.task_2;

public class Task2 {
    public static void main(String[] args) {
        int ameba = 1;
        int part = 2;


        for (int i = 0; i < 24; i += 3) {
            ameba *= 2;
            System.out.println("Будет " + ameba + " амеб(ы)");
        }

    }
}