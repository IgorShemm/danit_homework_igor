package hw_3.task_5;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        System.out.print("Введіть оператор (+, -, *, /, %): ");
        char op = scanner.next().charAt(0); // беремо перший символ

        int result = (op == '+') ? (a + b) :
                (op == '-') ? (a - b) :
                        (op == '*') ? (a * b) :
                                (op == '/') ? (b != 0 ? a / b : 0) :
                                        (op == '%') ? (b != 0 ? a % b : 0) :
                                                0;

        System.out.println("Результат: " + result);
    }
}