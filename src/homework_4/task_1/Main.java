package homework_4.task_1;

public class Main {
    public static void main(String[] args) {
        Student Student_1 = new Student("Dima", 15);
        Student Student_2 = new Student("Alex", 278);
        Student Student_3 = new Student();

        Student_1.show();
        System.out.println(Student_1.getName());
        System.out.println(Student_1.getAge());

        Student_2.show();
        System.out.println(Student_2.getName());
        System.out.println(Student_2.getAge());
    }
}
