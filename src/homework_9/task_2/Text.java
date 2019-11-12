package homework_9.task_2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//+
public class Text {

    private static final String FILE_PATH = "src/homework_9/task_2/output";

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            int replay = 10000;
            for (int i = 0; i < replay; i++) {
                fw.write("My name is Artur =)");
                fw.write("\n");
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

