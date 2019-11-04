package homework_9.task_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadSecretMessage {

    private static final String FILE_PATH = "src/homework_9/task_6/java.png";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}

