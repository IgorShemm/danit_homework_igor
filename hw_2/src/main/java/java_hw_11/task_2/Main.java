package java_hw_11.task_2;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Andrii", "Koval", 65, 45000.0));
        persons.add(new Person("Larysa", "Zhuk", 72, 38000.0));
        persons.add(new Person("Petro", "Shevchenko", 45, 52000.0));
        persons.add(new Person("Oksana", "Tkachenko", 78, 41000.0));
        persons.add(new Person("Ivan", "Bondar", 33, 47000.0));

        System.out.println("All persons:");
        persons.forEach(System.out::println);

        List<String> filteredNames = persons.stream()
                .filter(p -> p.getAge() < 70)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("Filtered names:");
        filteredNames.forEach(System.out::println);
    }
}
