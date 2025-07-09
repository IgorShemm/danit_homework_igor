package java_hw_3.task_1;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введіть перше слово (наприклад, \"Я\"): ");
        String string1 = scanner.next();

        System.out.print("Введіть друге слово (наприклад, \"тестую\"): ");
        String string2 = scanner.next();

        System.out.print("Введіть третє слово (наприклад, \"чудово.\"): ");
        String string3 = scanner.next();

        System.out.print("Введіть завершення речення (наприклад, \"Що ще потрібно?\"): ");
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println("\n=== Результат ===");
        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);
    }
}
