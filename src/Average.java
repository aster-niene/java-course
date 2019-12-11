import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число ");
        int secondNumber = scanner.nextInt();

        int beginRange = firstNumber > secondNumber ? secondNumber : firstNumber;
        int endRange = firstNumber > secondNumber ? firstNumber : secondNumber;
        int sum = 0;

        for (int i = beginRange; i <= endRange; i++) {
            sum += i;
        }
        System.out.println("Среднее арифметическое, введенного вами диапазона, равняется " + (double) sum / (endRange - beginRange + 1));

        // вторая часть задания. Можно объявить новые переменные, а можно обнулить страые
        sum = 0;
        int quantity = 0;

        for (int i = beginRange; i <= endRange; i++) {
            if (i % 2 == 0) {
                sum += i;
                quantity++;
            }
        }
        System.out.println("Среднее арифметическое четных элементов, введенного вами диапазона, равняется " + (double) sum / quantity);

        // допллнительная часть задания, через while
        sum = 0;
        int i = beginRange;

        while (i <= endRange) {
            sum += i;
            i++;
        }
        System.out.println("Среднее арифметическое, введенного вами диапазона, равняется " + (double) sum / (endRange - beginRange + 1));

        // вычисление срелнего, для четных чисел, через while
        sum = 0;
        quantity = 0;
        i = beginRange;

        while (i <= endRange) {
            if (i % 2 == 0) {
                sum += i;
                quantity++;
            }
            i++;
        }
        System.out.println("Среднее арифметическое, четных элементов, введенного вами диапазона, равняется " + (double) sum / quantity);
    }
}
