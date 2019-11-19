package homework_12.task_4;

import java.util.Scanner;

// +
public class UserMain {
    public static void main(String[] args) {
        Creator creators = () -> {
            System.out.println("Enter name: ");
            Scanner in = new Scanner(System.in);
            String userName = in.nextLine();
            return new User(userName);
        };
        User user = creators.createUser();
        System.out.println(user);
    }
}
