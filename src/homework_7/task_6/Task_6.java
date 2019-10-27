package homework_7.task_6;

public class Task_6 {
    public static void main(String[] args) {
        String[] word = {"Artur", "World", "java", "Windows", "Wrap"};
        for (int i = 0; i < word.length; i++) {
            if (word[i].startsWith("w") || word[i].startsWith("W")) {
                System.out.println(word[i]);
            }
        }
    }
}
