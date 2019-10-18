package homework_4.task_3;

import homework_4.task_1.Student;

public class Task_3 {
    public static void main(String[] args) {
        int count = 0;
        Student[] apprentice = new Student[7];

        apprentice[0] = new Student("Egor", 14);
        apprentice[1] = apprentice[0];
        apprentice[2] = new Student("Archi", 16);
        apprentice[3] = new Student();
        apprentice[4] = apprentice[2];
        apprentice[5] = apprentice[3];
        apprentice[6] = new Student("Vlad", 18);

        for (int i = 1; i < apprentice.length; i++) {
            if (apprentice[0].equals(apprentice[i])) {
                count++;
            }
        }
        System.out.println("Кол-во одинаковых объектов в массиве: " + count);
    }
}
