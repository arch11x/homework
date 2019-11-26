package homework_14.task_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "src/homework_14.task_5.text";
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Tom"));
        cats.add(new Cat("Max"));
        cats.add(new Cat("Mark"));
        serializableObject(path, cats);
        deserializableObject(path);
    }

    public static void serializableObject(String path, List<Cat> cats) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(cats);
        oos.close();
    }

    public static <cats> void deserializableObject(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            List<Cat> cats = (List<Cat>) ois.readObject();
            System.out.println(cats);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

