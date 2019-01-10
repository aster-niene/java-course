import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона ");
        int beginRange = scanner.nextInt();
        System.out.print("Введите конец диапазона ");
        int endRange = scanner.nextInt();
        int sum = 0;
        int quantity = 0;

        for (int i = beginRange; i <= endRange; i++) {
            sum += i;
            quantity++;
        }
        System.out.println("Среднее арифметическое равняется " +(double) sum / quantity);
// вторая часть задания. Можно объявить новые переменные, а можно обнулить страые
        sum = 0;
        quantity = 0;

        for (int i = beginRange; i <= endRange; i++) {
            if (i % 2 == 0) {
                sum += i;
                quantity++;
            }
        }
        System.out.println("Среднее арифметическое четных элементов равняется " + (double) sum / quantity);
    }
}
