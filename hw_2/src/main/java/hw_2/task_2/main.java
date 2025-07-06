package hw_2.task_2;

public class main {
    public static void main(String[] args) {
        String text = "Testing, is my favourite job";

        // Прибираємо кому і розбиваємо на слова
        String[] words = text.replace(",", "").split(" ");

        // Виводимо слова та їх довжини
        for (int i = 0; i < words.length; i++) {
            System.out.println("Слово" + (i + 1) + " = " + words[i] + ", Довжина цього слова = " + words[i].length());
        }

        // Перевіряємо, чи перше слово довше за всі інші
        int firstLength = words[0].length();
        boolean isLongest = true;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= firstLength) {
                isLongest = false;
                break;
            }
        }

        System.out.println(isLongest);
    }
}