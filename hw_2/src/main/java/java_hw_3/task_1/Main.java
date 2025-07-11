package java_hw_3.task_1;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first word (for example, \"Я\"): ");
        String string1 = scanner.next();

        System.out.print("Enter the second word (for example, \"тестую\"): ");
        String string2 = scanner.next();

        System.out.print("Enter the third word (for example, \"чудово.\"): ");
        String string3 = scanner.next();

        System.out.print("Enter the end of the sentence (for example, \"Що ще потрібно?\"): ");
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println("\n=== Result ===");
        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);
    }
}
