package hw_2.task_1;

public class Main {
    public static void main(String[] args) {
        // Initial string
        String string1 = "This line that i want to cut, cause it is too long";

        // Cut the string to: "This line that i want to cut, cause"
        String string2 = string1.substring(0, "This line that i want to cut, cause".length());

        // Replace part of the string with a new version containing a proper ending
        String string3 = string2.replace("i want to cut, cause", "don't want to cut, cause it is perfect");

        // Print all strings and their lengths
        System.out.println("String1: " + string1);
        System.out.println("Length: " + string1.length());

        System.out.println("String2: " + string2);
        System.out.println("Length: " + string2.length());

        System.out.println("String3: " + string3);
        System.out.println("Length: " + string3.length());
    }
}