package java_hw_11.task_1;

import java.util.List;

@FunctionalInterface
public interface SessionCloser {
    void closeSession(List<CanBeClosed> entities);
}
