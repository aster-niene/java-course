import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер искомого числа Фибоначи ");
        int n = scanner.nextInt();

        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;

        if (n == 0) {
            System.out.println(n + "-e число Фибоначи равно " + firstFibonacciNumber);
        } else if (n == 1) {
            System.out.println(n + "-e число Фибоначи равно " + secondFibonacciNumber);
        } else {
            for (int i = 1; i < n; ++i) {
                int fibonacciNumber = firstFibonacciNumber + secondFibonacciNumber;
                firstFibonacciNumber = secondFibonacciNumber;
                secondFibonacciNumber = fibonacciNumber;
            }
            System.out.println(n + "-e число Фибоначи равно " + secondFibonacciNumber);
        }
    }
}
