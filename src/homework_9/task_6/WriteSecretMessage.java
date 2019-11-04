package homework_9.task_6;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSecretMessage {

    private static final String FILE_PATH = "src/homework_9/task_6/java.png";

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            fw.write("It can only be read by a select few");

            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}