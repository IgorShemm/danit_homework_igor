package task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> people = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("People Management System Started");

        while (true) {
            System.out.println("Choose operation: addPerson / getPerson / exit");
            String command = scanner.nextLine().trim();

            if (command.equals("addPerson")) {
                System.out.print("Enter surname: ");
                String surname = scanner.nextLine().trim().toUpperCase();

                System.out.print("Enter name: ");
                String name = scanner.nextLine().trim();

                int age;
                while (true) {
                    System.out.print("Enter age: ");
                    String input = scanner.nextLine().trim();
                    try {
                        age = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid age format. Please enter a number.");
                    }
                }

                if (people.containsKey(surname)) {
                    System.out.println("Person already exists. Replace existing? (yes/no)");
                    String answer = scanner.nextLine().trim();
                    if (!answer.equalsIgnoreCase("yes")) {
                        System.out.println("Person not updated.");
                        continue;
                    }
                }

                Person person = new Person(name, surname, age);
                people.put(surname, person);
                System.out.println("Person added/updated successfully.");

            } else if (command.equals("getPerson")) {
                if (people.isEmpty()) {
                    System.out.println("The list is empty.");
                    continue;
                }

                System.out.print("Enter surname to search: ");
                String surname = scanner.nextLine().trim().toUpperCase();

                if (people.containsKey(surname)) {
                    System.out.println(people.get(surname));
                } else {
                    System.out.println("No person found with this surname.");
                    System.out.println("Available surnames:");
                    for (String key : people.keySet()) {
                        System.out.println(key);
                    }
                }

            } else if (command.equals("exit")) {
                System.out.println("Program terminated.");
                break;

            } else {
                System.out.println("Unknown operation. Please try again.");
            }
        }
    }
}
