package hw_7.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student.addStudent(studentList, new Student(1, "Oksana", 20, 3.6));
        Student.addStudent(studentList, new Student(2, "Mykola", 21, 3.7));
        Student.addStudent(studentList, new Student(3, "Kateryna", 19, 3.4));
        Student.addStudent(studentList, new Student(4, "Taras", 22, 3.9));
        Student.addStudent(studentList, new Student(5, "Olena", 20, 3.5));

        System.out.println("All students:");
        Student.printAllStudents(studentList);

        System.out.println("\nRemoving student with ID = 3...");
        Student.removeStudentById(studentList, 3);
        Student.printAllStudents(studentList);

        System.out.println("\nSearching for student with name 'Taras'...");
        Student result = Student.findStudentByName(studentList, "Taras");
        if (result != null) {
            System.out.println("Found: " + result);
        }

        System.out.println("\nSearching for student with name 'Andriy'...");
        Student.findStudentByName(studentList, "Andriy");
    }
}
