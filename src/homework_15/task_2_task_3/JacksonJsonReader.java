package homework_15.task_2_task_3;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import homework_15.entity.Student;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JacksonJsonReader {
    //абсолютные пути зло
    //файлы json без расширений - стоит добавить
    private static final String FOLDER_PATH = "C:\\Users\\Artur Kuznetcov\\IdeaProjects\\homework1\\resource\\json\\Students\\Student";
    private static final String NEW_FILE_PATH = "homework_15/task_2_task_3/List";
    private static final String NEW_JSON_FILE_PATH = "C:\\Users\\Artur Kuznetcov\\IdeaProjects\\homework1\\resource\\json\\Students\\output";

    public static void main(String[] args) throws IOException {
        List<Student> students = ListOfAllJson(FOLDER_PATH);
        writeListToFile(NEW_FILE_PATH, students);
        writeListToJsonFile(NEW_JSON_FILE_PATH, students);
    }

    private static Student readJSON(File fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = objectMapper.readValue(new File(String.valueOf(fileName)), Student.class);
        return student;
    }

    // ListOfAllJson -> list...
    private static List<Student> ListOfAllJson(String dir) throws IOException {
        File f = new File(dir);
        File[] list = f.listFiles();
        List<Student> studentList = new ArrayList<>();
        for (File entry : list) {
            studentList.add(readJSON(entry));
        }
        Collections.sort(studentList, Comparator.comparing(Student::getName).thenComparing(Student::getSurname));
        return studentList;
    }

    private static void writeListToJsonFile(String fileName, List<Student> students) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FileWriter fileWriter = new FileWriter(fileName);
        objectMapper.writeValue(fileWriter, students);
        System.out.println("File 'json' has been successfully written");
    }

    private static void writeListToFile(String fileName, List<Student> students) {
        try (FileWriter fileWriter = new FileWriter(new File(NEW_FILE_PATH));
             BufferedWriter buff = new BufferedWriter(fileWriter)) {
            buff.write(String.valueOf(students)); // не, записывать объект как строку вообще грустная история, не надо так делать
            buff.flush();
            System.out.println("File has been successfully written");
        } catch (IOException e) {
            System.out.println("Error in writing" + e.getMessage());
        }
    }

}
