package java_hw_3.task_6;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Яка програма вас цікавить (IntelliJ IDEA, Git, Java): ");
        String program = scanner.nextLine();

        System.out.print("Вкажіть вашу операційну систему (Linux, MacOS, Windows): ");
        String os = scanner.nextLine();

        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {
                    case "Linux":
                        System.out.println("https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    case "MacOS":
                        System.out.println("https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case "Windows":
                        System.out.println("https://www.jetbrains.com/idea/download/#section=windows");
                        break;
                    default:
                        System.out.println("Такої ОС не існує.");
                }
                break;

            case "Git":
                switch (os) {
                    case "Linux":
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    case "MacOS":
                        System.out.println("https://git-scm.com/download/mac");
                        break;
                    case "Windows":
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    default:
                        System.out.println("Такої ОС не існує.");
                }
                break;

            case "Java":
                switch (os) {
                    case "Linux":
                        System.out.println("https://www.oracle.com/java/technologies/javase-jdk11-downloads.html");
                        break;
                    case "MacOS":
                        System.out.println("https://www.oracle.com/java/technologies/javase-jdk11-downloads.html");
                        break;
                    case "Windows":
                        System.out.println("https://www.oracle.com/java/technologies/javase-jdk11-downloads.html");
                        break;
                    default:
                        System.out.println("Такої ОС не існує.");
                }
                break;

            default:
                System.out.println("Такої програми не існує.");
        }
    }
}
