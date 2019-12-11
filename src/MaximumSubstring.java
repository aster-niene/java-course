import java.util.Scanner;

public class MaximumSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLineLength = 0;
        int currentLineLength = 1;

        System.out.println("Введите строку символов:");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length() - 1; ++i) {
            char currentSymbol = Character.toLowerCase(string.charAt(i));
            char nextSymbol = Character.toLowerCase(string.charAt(i + 1));
            if (currentSymbol == nextSymbol) {
                currentLineLength++;
            } else {
                currentLineLength = 1;
            }
            if (currentLineLength > maxLineLength) {
                maxLineLength = currentLineLength;
            }
        }
        System.out.println("Максимальная неприрывная длинна одинаковых символов равна " + maxLineLength);
    }
}

