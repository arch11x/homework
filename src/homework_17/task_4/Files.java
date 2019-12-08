package homework_17.task_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;

// Integer -> объект с именем файла и кол-вом слов
public class Files implements Callable<Integer> {
    private File file;

    public Files(File file) {
        this.file = file;
    }

    @Override
    public Integer call() {
        Integer counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println(Thread.currentThread().getName());
            String line;
            while ((line = br.readLine()) != null) {
                counter += line.split(" ").length;
            }
        } catch (IOException e) {
            System.err.println("Problem with reading from file: " + e.getMessage());
        }
        return counter;
    }
}
