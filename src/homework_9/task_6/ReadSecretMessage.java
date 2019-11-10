package homework_9.task_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadSecretMessage {

    private static final String FILE_PATH = "src/homework_9/task_6/java.png";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            /*
            в этом коде ты прочитал весь файл, а нужно было только ту часть, где находится сообщение
тебе нужно было запомнить место с которого начинается сообщение и сколько байт занимает сообщение, чтобы затем
прочитать именно этот кусок файла
            */
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}

