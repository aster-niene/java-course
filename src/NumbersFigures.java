import java.util.Scanner;

public class NumbersFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число ");
        int digit = scanner.nextInt();
        int sum = 0;
        int evenSum = 0;
        int notEvenSum = 0;
        int max = 0;

        while (digit > 0) {
            int numeral = digit % 10;
            digit = digit / 10;
            sum += numeral;
            if (numeral % 2 == 0) {
                evenSum += numeral;
            } else {
                notEvenSum += numeral;
            }
            max = (max < numeral) ? numeral : max;
        }
        System.out.println("Сумма цифр числа равна " + sum);
        System.out.println("Сумма четных цифр числа равна " + evenSum);
        System.out.println("Сумма не четных цифр числа равна " + notEvenSum);
        System.out.println("Максимальное цифра в этом числе " + max);
    }
}
