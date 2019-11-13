package homework_10.task_2;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

// +
public class FileRenameMain {
    private static final String FILE_PATH_JAVA = "src/homework_10/task_2/HELloFroMjaVa";
    private static final String FILE_PATH_WORLD = "src/homework_10/task_2/MynaMEIsArtUr";
    private static final String FILE_PATH_OK = "src/homework_10/task_2/eVEryThINGisoK";

    public static void main(String[] args) {
        File fileJava = new File(FILE_PATH_JAVA);
        File fileWorld = new File(FILE_PATH_WORLD);
        File fileOk = new File(FILE_PATH_OK);

        try {
            fileJava.createNewFile();
            fileWorld.createNewFile();
            fileOk.createNewFile();
        } catch (IOException e) {
            System.err.println("Problem in creating file " + e.getMessage());
        }

        FileRenameMain fileToChangeName = new FileRenameMain();
        fileToChangeName.perfomStrategy(FileStrategy.NAME_LOWER_CASE, fileJava);
        fileToChangeName.perfomStrategy(FileStrategy.NAME_LITTLE_BIG, fileWorld);
        fileToChangeName.perfomStrategy(FileStrategy.NAME_CAPS, fileOk);
    }

    private static void perfomStrategy(FileStrategy fileStrategy, File file) {
        fileStrategy.renameFile(file);
    }
}
