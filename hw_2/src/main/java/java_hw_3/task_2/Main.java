package java_hw_3.task_2;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        int a = scanner.nextInt();

        System.out.print("Enter the length of the second side: ");
        int b = scanner.nextInt();

        System.out.print("Enter the length of the third side: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("! A triangle can be constructed.");
        } else {
            System.out.println("!!! It is not possible to construct a triangle.");
        }
    }
}
