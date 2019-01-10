import java.util.Scanner;

public class DoWhileAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона ");
        int beginRange = scanner.nextInt();
        System.out.print("Введите конец диапазона ");
        int endRange = scanner.nextInt();
        int sum = 0;
        int quantity = 0;
        int i = beginRange; //вводим переенную i исключительно что-б соответствовать "канону", так она тут нафиг не упала.

        while (i <= endRange) {
            sum += i;
            ++i;
            quantity++;
        }
        System.out.println("Среднее арифметическое равняется " + (double) sum / quantity);
// Вторая часть Марльзонского балета
        sum = 0;
        quantity = 0;
        i = beginRange;
        while (i <= endRange) {
            if (i % 2 == 0) {
                sum += i;
                quantity++;
            }
            ++i;
        }
        System.out.println("Среднее арифметическое четных элементов равняется " + (double) sum / quantity);
    }
}
