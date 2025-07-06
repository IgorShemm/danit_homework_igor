package hw_2.task_1;

public class main {
    public static void main(String[] args) {
        // Початковий рядок
        String string1 = "This line that i want to cut, cause it is too long";

        // Обрізаємо до: "This line that i want to cut, cause"
        String string2 = string1.substring(0, "This line that i want to cut, cause".length());

        // Замінюємо частину рядка на нову версію з правильним завершенням
        String string3 = string2.replace("i want to cut, cause", "don't want to cut, cause it is perfect");

        // Виводимо всі рядки та їх довжини
        System.out.println("String1: " + string1);
        System.out.println("Length: " + string1.length());

        System.out.println("String2: " + string2);
        System.out.println("Length: " + string2.length());

        System.out.println("String3: " + string3);
        System.out.println("Length: " + string3.length());
    }
}