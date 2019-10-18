package homework_4.task_4;

import homework_4.task_1.Student;

public class Task_4 {
    public static void main(String[] args) {
        Student people_1 = new Student();
        Student people_2 = new Student("Nik", 212);
        people_1.setText("Hello, Archi");

        people_1.printText();
        people_2.printText();
    }
}
