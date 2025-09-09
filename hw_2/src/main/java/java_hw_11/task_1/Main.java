package java_hw_11.task_1;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<CanBeClosed> entities = new ArrayList<>();
        entities.add(new MyBrowser());
        entities.add(new MyFile());

        SessionCloser closer = list -> list.forEach(CanBeClosed::close);
        closer.closeSession(entities);
    }
}
