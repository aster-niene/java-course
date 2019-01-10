import java.util.Scanner;

public class NumbersFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число первый раз ");
        int firstNumbers = scanner.nextInt();
        int sum = 0;

        for (int i = 0; firstNumbers > 0; i++) {
            int numeral = firstNumbers % 10;
            firstNumbers = firstNumbers / 10;
            sum += numeral;
        }
        System.out.println("Сумма цифр числа равна " + sum);

        // находим сумму четных чисел
        System.out.println("Введите число второй раз ");
        int secondNumbers = scanner.nextInt();
        sum = 0;

        for (int i = 0; secondNumbers > 0; i++) {
            int numeral = secondNumbers % 10;
            secondNumbers = secondNumbers / 10;
            if (numeral % 2 == 0) {
                sum += numeral;
            }
        }
        System.out.println("Сумма четных цифр числа равна " + sum);

        // находим максимальное число
        System.out.println("Введите число в третий раз ");
        int thirdNumbers = scanner.nextInt();
        int max = 0;

        for (int i = 0; thirdNumbers > 0; i++) {
            int numeral = thirdNumbers % 10;
            thirdNumbers = thirdNumbers / 10;
            max = (max < numeral) ? numeral : max;
        }
        System.out.println("Максимальное цифра в этом числе " + max);
    }
}
