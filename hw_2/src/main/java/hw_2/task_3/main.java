package hw_2.task_3;

public class main {
    public static void main(String[] args) {
        // Початковий рядок
        String text = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";

        // Порахуємо кількість 'a'
        int lowerCount = text.split("a").length - 1;

        // Порахуємо кількість 'A'
        int upperCount = text.split("A").length - 1;

        // Виводимо результати
        System.out.println("Кількість маленьких 'a': " + lowerCount);
        System.out.println("Кількість великих 'A': " + upperCount);
        System.out.println("Загальна кількість символів 'a' (незалежно від регістру): " + (lowerCount + upperCount));
    }
}