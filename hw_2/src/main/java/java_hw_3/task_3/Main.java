package java_hw_3.task_3;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        int difference;

        if (a > b) {
            difference = a - b;
        } else {
            difference = b - a;
        }

        System.out.println("Різниця (більше - менше) = " + difference);
    }
}