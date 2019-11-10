package homework_9.task_7;

import java.io.File;

// +
public class Folder {
    private static final String FILE_PATH = "src";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        try {
            if (file.isDirectory()) {
                folderTraversal(file, 0);
            } else {
                throw new MyException(" ");
            }
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void folderTraversal(File file, int level) {
        if (file.isFile()) {
            System.out.println("\t".repeat(level) + "File: " + file.getName());
        } else {
            System.out.println("\t".repeat(level) + "Directory: " + file.getName());
            level++;
            for (File tempFile : file.listFiles()) {
                folderTraversal(tempFile, level);
            }
        }
    }
}
