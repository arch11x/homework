package homework_17.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Garage {
    private List<String> stringList = new ArrayList<>();
    private ReentrantLock locker = new ReentrantLock();

    public void addToList(String string) {
        // https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/locks/Lock.html#tryLock()
        // у тебя не совсем корректно написана логика, if должен быть за пределами try, по ссылке выше пример
        try {
            boolean isLocked = locker.tryLock();
            if (isLocked) {
                stringList.add(string);
            }
        } finally {
            locker.unlock();
        }
    }

    public List<String> getList() {
        return stringList;
    }
}
