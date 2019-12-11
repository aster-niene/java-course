import java.util.Scanner;

public class DoWhileAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число ");
        int secondNumber = scanner.nextInt();

        int beginRange = firstNumber > secondNumber ? secondNumber : firstNumber;
        int endRange = firstNumber > secondNumber ? firstNumber : secondNumber;
        int sum = 0;
        int quantity = 0;
        int i = beginRange;

        do {
            sum += i;
            ++i;
            quantity++;
        } while (i <= endRange);
        System.out.println("Среднее арифметическое равняется " + (double) sum / quantity);

        // Вторая часть Марльзонского балета
        sum = 0;
        quantity = 0;
        i = beginRange;
        do {
            if (i % 2 == 0) {
                sum += i;
                quantity++;
            }
            ++i;
        } while (i <= endRange);
        System.out.println("Среднее арифметическое четных элементов равняется " + (double) sum / quantity);
    }
}
