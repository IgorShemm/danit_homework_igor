package hw_9.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 240));
        cars.add(new Car("Toyota", 180));
        cars.add(new Car("Audi", 220));
        cars.add(new Car("Mercedes", 230));
        cars.add(new Car("Mazda", 200));

        System.out.println("Before sorting:");
        cars.forEach(System.out::println);

        cars.sort(new SpeedComparator());

        System.out.println("\nAfter sorting by speed:");
        cars.forEach(System.out::println);
    }
}
