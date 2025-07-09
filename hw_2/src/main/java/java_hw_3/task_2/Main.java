package java_hw_3.task_2;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введіть довжину першої сторони: ");
        int a = scanner.nextInt();

        System.out.print("Введіть довжину другої сторони: ");
        int b = scanner.nextInt();

        System.out.print("Введіть довжину третьої сторони: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("! Можна побудувати трикутник.");
        } else {
            System.out.println("!!! Не можна побудувати трикутник.");
        }
    }
}
