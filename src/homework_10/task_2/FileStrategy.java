package homework_10.task_2;

import java.io.File;

public enum FileStrategy {
    NAME_LOWER_CASE {
        @Override
        public void renameFile(File file) {
            String fileName = file.getName();
            fileName = fileName.toLowerCase();
            String newFilePath = file.getAbsolutePath().replace(file.getName(), "") + fileName;
            File resultFile = new File(newFilePath);
            if (file.renameTo(resultFile)) {
                System.out.println("File renamed");
            } else {
                System.out.println("The file can't be renamed");
            }
            System.out.println(resultFile.getName());
        }
    },
    NAME_LITTLE_BIG {
        @Override
        public void renameFile(File file) {
            String fileName = file.getName();
            fileName = fileName.substring(0, 1).toUpperCase() + fileName.substring(1).toLowerCase();
            String newFilePath = file.getAbsolutePath().replace(file.getName(), "") + fileName;
            File resultFile = new File(newFilePath);
            if (file.renameTo(resultFile)) {
                System.out.println("File renamed");
            } else {
                System.out.println("The file can't be renamed");
            }
            System.out.println(resultFile.getName());
        }
    },
    NAME_CAPS {
        public void renameFile(File file) {
            String fileName = file.getName();
            fileName = fileName.toUpperCase();
            String newFilePath = file.getAbsolutePath().replace(file.getName(), "") + fileName;
            File resultFile = new File(newFilePath);
            if (file.renameTo(resultFile)) {
                System.out.println("File renamed");
            } else {
                System.out.println("The file can't be renamed");
            }
            System.out.println(resultFile.getName());
        }
    };

    public abstract void renameFile(File file);
}
