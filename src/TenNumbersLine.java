import java.util.Scanner; // сразу от x до y по n в строке

public class TenNumbersLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона ");
        int beginRange = scanner.nextInt();
        System.out.print("Введите конец диапазона ");
        int endRange = scanner.nextInt();
        System.out.print("Введите кратность диапазона ");
        int multiplicity = scanner.nextInt();
        int i = beginRange;

        while (i <= endRange) {
            if (i % multiplicity == 0) {
                System.out.printf("%10s%n", i);
            } else {
                System.out.printf("%10s", i);
            }
            i++;
        }
    }
}
