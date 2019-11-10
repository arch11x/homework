package homework_9.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// +
public class ReadAndOutputText {

    private static final String FILE_PATH = "src/homework_9/task_2/output";

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
