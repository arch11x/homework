package homework_9.task_4;

import java.io.*;

// Object - лучше не называй файлы такими именами. Класс Object есть в java
public class Object {
    private static final String FILE_NAME = "src/homework_9/task_4/output";

    public static void main(String[] args) {
        createFile(FILE_NAME);
        Employee artur = new Employee("Artur", 16, new Work("Student", 10));
        writeObjectToFile(artur, FILE_NAME);
        readObjectFromFile(artur, FILE_NAME);
    }

    public static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error in creating file" + e.getMessage());
        }
    }

    public static void writeObjectToFile(Employee object, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream obs = new ObjectOutputStream(fos)) {
            obs.writeObject(object);
            obs.flush();
        } catch (FileNotFoundException e) {
            System.out.println("No such file" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // аргумент object никак не используется
    public static void readObjectFromFile(Employee object, String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream obis = new ObjectInputStream(fis)) {
            // object = (Employee) obis.readObject();
            // а лучше
            /* Employee employee = (Employee) obis.readObject();
            return employee;
            а на экран вывести в методе мейн
            */
            Object obj = (Object) obis.readObject();
            System.out.println(obj);
        } catch (ClassNotFoundException | FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
