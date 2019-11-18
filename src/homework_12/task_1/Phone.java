package homework_12.task_1;

public class Phone implements Comparable<Phone> {
    private String name;

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Phone phone) {
        return name.compareTo(phone.getName());
    }
}