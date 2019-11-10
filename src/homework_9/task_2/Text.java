package homework_9.task_2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Text {

    private static final String FILE_PATH = "src/homework_9/task_2/output";

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            for (int i = 0; i < 10000; i++) { // 10_000 в переменную
                fw.write("My name is Artur =)");
                fw.write("\n");
            }
// пустая строка не нужна
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

