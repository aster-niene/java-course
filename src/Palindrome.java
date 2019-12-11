import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean identicalLetters = true;

        System.out.println("Введите ваш палиндром:");
        String string = scanner.nextLine();

        string = string.replace(" ", "");
        string = string.toLowerCase();

        for (int i = 0; i < (string.length() / 2); ++i) {
            char firstCharacter = string.charAt(i);
            char secondCharacter = string.charAt((string.length() - i) - 1);
            identicalLetters = (firstCharacter == secondCharacter);
            if (!identicalLetters) {
                break;
            }
        }
        if (identicalLetters) {
            System.out.println("Да, это палиндром");
        } else {
            System.out.println("Нет, это не палиндром");
        }
    }
}
