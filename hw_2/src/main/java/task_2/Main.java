package task_2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        Person p1 = new Person("Oleh", "Shevchenko", 30);
        Person p2 = new Person("Iryna", "Koval", 25);
        Person p3 = new Person("Oleh", "Shevchenko", 30);
        Person p4 = new Person("Taras", "Bondarenko", 40);
        Person p5 = new Person("Iryna", "Koval", 25);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        System.out.println("Set contains " + people.size() + " unique people:");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("\nTesting basic Set methods:");
        System.out.println("Is set empty? " + people.isEmpty());
        System.out.println("Does set contain Iryna Koval? " +
                people.contains(new Person("Iryna", "Koval", 25)));

        boolean removed = people.remove(new Person("Taras", "Bondarenko", 40));
        System.out.println("Was Taras Bondarenko removed? " + removed);

        System.out.println("\nSet after removal:");
        for (Person person : people) {
            System.out.println(person);
        }

        people.clear();
        System.out.println("\nSet after clear. Size = " + people.size());
    }
}
