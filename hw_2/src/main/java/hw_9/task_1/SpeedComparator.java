package hw_9.task_1;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return Integer.compare(c1.getSpeed(), c2.getSpeed());
    }
}
