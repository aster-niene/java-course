import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        System.out.println("Введите строку");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int simbolCount = 0;
        int namberCount = 0;
        int spaceCount = 0;
        int anotherCount = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                namberCount = namberCount + 1;
            } else if (Character.isLetter(c)) {
                simbolCount = simbolCount + 1;
            } else if (Character.isWhitespace(c)) {
                spaceCount = spaceCount + 1;
            } else {
                anotherCount = anotherCount + 1;
            }

        }
        System.out.println("цифр " + namberCount);
        System.out.println("букв " + simbolCount);
        System.out.println("пробелов " + spaceCount);
        System.out.println("иных символов " + anotherCount);

    }

}
