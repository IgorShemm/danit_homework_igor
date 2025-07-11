package java_hw_3.task_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which software are you interested in (IntelliJ IDEA, Git, Java): ");
        String program = scanner.nextLine();

        System.out.print("Specify your operating system (Linux, MacOS, Windows): ");
        String os = scanner.nextLine();

        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {
                    case "Linux":
                        System.out.println("Download link: https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    case "MacOS":
                        System.out.println("Download link: https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case "Windows":
                        System.out.println("Download link: https://www.jetbrains.com/idea/download/#section=windows");
                        break;
                    default:
                        System.out.println("Such an operating system does not exist.");
                }
                break;

            case "Git":
                switch (os) {
                    case "Linux":
                        System.out.println("Download link: https://git-scm.com/download/linux");
                        break;
                    case "MacOS":
                        System.out.println("Download link: https://git-scm.com/download/mac");
                        break;
                    case "Windows":
                        System.out.println("Download link: https://git-scm.com/download/win");
                        break;
                    default:
                        System.out.println("Such an operating system does not exist.");
                }
                break;

            case "Java":
                switch (os) {
                    case "Linux":
                    case "MacOS":
                    case "Windows":
                        System.out.println("Download link: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html");
                        break;
                    default:
                        System.out.println("Such an operating system does not exist.");
                }
                break;

            default:
                System.out.println("Such a software program does not exist.");
        }
    }
}
