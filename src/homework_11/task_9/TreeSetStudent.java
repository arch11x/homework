package homework_11.task_9;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudent {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Dima ", 16, "FFA"));
        students.add(new Student("Artur", 14, "FFA"));
        students.add(new Student("Liza", 20, "GTA"));
        students.add(new Student("Artur", 18, "LGA"));

        System.out.println(students);
    }
}